package org.example

class ExampleController {

    static defaultAction = "defaultAct"

    def beforeInterceptor = {
        render "Tracing action a"
    }

    def afterInterceptor = {
        render "After Interceptor";
        render {action:index()}
    }
    def defaultAct(){
        render "Default Action"
    }
    def index() {
        render "Hello from example"
    }
    def example(){
//        render (view:"example.gsp")
//        render (view: "example", model:["name":"hariom"])
        String nameSent = params.name;
        render (view: "example", model:["name":nameSent])
    }

}
