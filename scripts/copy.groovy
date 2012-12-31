// a simple script for copying from one directory to another.

def source = args[0]

def destination = args[1]

def ant = new AntBuilder()

ant.sequential {
	echo("starting to copy")
	
	mkdir(dir:destination)
	
	copy(todir:destination) {
        fileset(dir:source)
    }
	
	echo("all done")
}