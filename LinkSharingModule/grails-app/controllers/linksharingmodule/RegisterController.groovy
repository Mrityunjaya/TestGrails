package linksharingmodule

import com.src.main.user.User
import org.code.app.UserRegistrationCO

class RegisterController {

    def user(UserRegistrationCO userRegistrationCO){
        User user = new User(userRegistrationCO.properties);
        println user;
        if(!userRegistrationCO.validate()){
            println userRegistrationCO.validate()
//            "---invalid user"
            render (view: "/index", model: ["diffConfirmPswd":true])
        }else {
            render user.save()
        }
    }
}
