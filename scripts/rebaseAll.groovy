// A script for rebasing a directory full of git repositories

File file = new File(args[0])

if (file.exists() && file.directory){
    def failures = processDirectories(file)    
    processFailures(failures)
} else {
    println "Unable to rebase ${file.absolutePath}."
}

void processFailures(List<File> failures){
    if (failures) {
        println "\n"
        println "Failed processing the following directories:"
        failures.each {
            println "\t- ${it.name}"
        }
        println "\n"        
    }
}

List<File> processDirectories(File file){
    List<File> failures = []
    file.eachDir {projectDirectory ->
        if (isGitProject(projectDirectory)){
            println "rebasing ${projectDirectory.name}"
            if (executeRebase(projectDirectory) != 0){
                failures << projectDirectory
            }
        }
    }
    failures
}

boolean isGitProject(File directory){
    File gitFolder = new File(directory, ".git")
    gitFolder.exists() && gitFolder.isDirectory()
}

def executeRebase(File projectDirectory){
    Process p = "git svn rebase".execute([], projectDirectory)            
    p.waitForProcessOutput(System.out, System.err)         
    println "\n"
    p.exitValue()   
}
