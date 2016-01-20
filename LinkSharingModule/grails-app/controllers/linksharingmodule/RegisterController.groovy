package linksharingmodule

import com.src.main.user.User
import org.code.app.UserRegistrationCO

class RegisterController {
    def userService;

    def user(UserRegistrationCO userRegistrationCO) {
        User user = new User(userRegistrationCO.properties);
        println user;
        if (!userRegistrationCO.validate()) {
            println userRegistrationCO.validate()
//            "---invalid user"
            render(view: "/index", model: ["diffConfirmPswd": true])
        } else {
            if (userService.addUser(user)) {
                render(view: "/index", model: ["userAdded": true])
            } else {
                render(view: "/index", model: ["userAdded": false])
            }
        }
    }
}
