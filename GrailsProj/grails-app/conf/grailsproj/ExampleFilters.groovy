package grailsproj

class ExampleFilters {

    def filters = {
        all(controller:'*', action:'*') {
            before = {
                println "Before filter 1 "
                println session.toString()
            }
            after = { Map model ->
                println "After Filter 1"
            }
            afterView = { Exception e ->
                println "After View 1"
            }
        }
        single(controller:'example', action:'*') {
            before = {
                println "Before filter 2"
                println session.toString()
            }
            after = { Map model ->
                println "After Filter 2"
            }
            afterView = { Exception e ->
                println "After View 2"
                render {e.toString()}
            }
        }
        uri(uri:"/user") {
            before = {
                println "Before filter 3"
                println session.toString()
            }
            after = { Map model ->
                println "After Filter 3"
            }
            afterView = { Exception e ->
                println "After View 3"
            }
        }
    }
}
