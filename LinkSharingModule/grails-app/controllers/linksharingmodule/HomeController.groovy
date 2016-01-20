package linksharingmodule

class HomeController {

    def index() {
        render([view: "/index", model: ["tmplObjects": [1, 2, 3, 4]]])
    }
}
