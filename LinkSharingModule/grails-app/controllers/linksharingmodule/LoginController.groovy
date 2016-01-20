package linksharingmodule

import com.src.main.user.User
import org.code.app.UserResetPswdCO

class LoginController {
    def userService;

    def home() {
        String userName = params.name;
        String password = params.pswd;
        User user = userService(userName)
        println user
        if (user != null) {
            if (password.equals(user.password)) {
                session["user"] = user.firstName
                render(view: "/login/homePage",)
            } else {
                render(view: "/index", model: ["password": true])
            }
        } else {
            render(view: "/index", model: ["username": true])
        }
    }

    def forgotPassword() {
        render(view: "/login/resetPswd")
    }

    def resetPassword(UserResetPswdCO userResetPswdCO) {
        User user = userService.getUserByNameOrEmail(userResetPswdCO.name)
        if (!userResetPswdCO.validate()) {
            println("hahaha")
            render(view: "/login/resetPswd", model: ["passwordNotReset": true])
        } else if (user == null) {
            render(view: "/login/resetPswd", model: ["nullUser": true])
        } else {
            println("hahaha")
            if (userService.updatePassword(user, userResetPswdCO.pswd)) {
                render(view: "/index", model: ["passwordReset": true])
            } else {
                render(view: "/login/resetPswd", model: ["passwordReset": false])
            }
        }
    }
}
