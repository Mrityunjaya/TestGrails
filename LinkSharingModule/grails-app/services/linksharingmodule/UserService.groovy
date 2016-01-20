package linksharingmodule

import com.src.main.user.User
import grails.transaction.Transactional
import org.code.app.UserResetPswdCO

@Transactional
class UserService {

    def addUser(User user) {
        try {
            user.save()
            return true;
        } catch (Exception e) {
//            Throw new RuntimeException("Can not Add User", e.message)
            return false;
        }
    }

    def getUserByNameOrEmail(String userName) {
        User user = User.findByUsername(userName)
        if (user == null) {
            user = User.findByEmailIlike(userName)
            if (user != null) {
                int emailDomainStartIndex = user.email.indexOf('@')
                println user.email.substring(0, emailDomainStartIndex) + "---UserService---okokokokok"
                if (user.email.substring(0, emailDomainStartIndex).equals(userName)) {
                    return user
                }
            }
        }
        return user;
    }

    def updatePassword(User user, String newPswd) {
        try {
            user.password = newPswd
            user.save()
            println(user.password + "------")
            return true;
        } catch (Exception e) {
//            Throw new RuntimeException("Can not Update User", e.message)
            return false;
        }
    }
}
