import groovy.io.FileType
File file = new File ("/home/niranjan/Documents/TestGrails/GroovyProj2/src/a.txt")
new File("/home/niranjan/Documents/TestGrails/GroovyProj2/src").eachFileRecurse(FileType.FILES) {
    it.eachLine({line->
//    println(line)
    file.append(line) 
    })
}