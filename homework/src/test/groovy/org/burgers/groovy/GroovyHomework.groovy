package org.burgers.groovy

class GroovyHomework {
    def getFile(String fileName){
        new File(ClassLoader.getSystemClassLoader().getResource(fileName).toURI())
    }
}
