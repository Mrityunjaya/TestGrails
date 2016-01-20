package org.example

class AbcController {

    def index2() {
        render "abc"
    }

    def abc(){
        render(view: "/example/example", model: [name: "hihihihi"])
    }
}
