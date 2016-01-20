package linksharingmodule

import com.src.main.user.User

class LoginController {

    def login() {
        println "hihihihi"
        String userName = params.name;
        String password = params.pswd;
        User user = User.findByUsername(userName)
        println user
        if(user != null){
            println "jijijijijijijijijijiji"
            if(password.equals(user.password)) {
                session["user"] = user.firstName
                render(view: "/login/homePage", )
            }else{
                render(view: "/index", model: ["password":true])
            }
        }
        else{
            println "jojojojojojojojojojojojo"
                render(view: "/index", model: ["username":true])
        }
    }
}
