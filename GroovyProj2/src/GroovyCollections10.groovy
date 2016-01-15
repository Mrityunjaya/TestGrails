import groovy.io.FileType
File file = new File ("/home/niranjan/Documents/TestGrails/GroovyProj2/abc.txt")
File newFile = new File ("/home/niranjan/Documents/TestGrails/GroovyProj2/oddLineFile.txt")
int counter = 0
file.eachLine({line->
    counter++;
    if(counter%2 == 1){
        newFile.append(counter+". " + line + "\n")
    }
    println(line)
})
