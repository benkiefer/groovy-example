File file = new File(args[0])

process(file)

void process(File file){
    file.eachFile {
        if (it.isDirectory()){
            process(it)
        } else {
            convert(it)
        }
    }
}

void convert(File file){
    if (file.name.endsWith("java")){
        scrub(file)
        rename(file)
    }
}

void rename(File file){
    file.renameTo(new File(file.parent, file.name.replace("java", "groovy")))
}

void scrub(File file){
    def text = ""

    file.eachLine {it ->
        if (!it.startsWith("import java.")){
            it = it.replaceAll(";", "")
            it = it.replaceAll("public ", "")
            text += "${it}\n"
        }
    }

    file.text = text
}



