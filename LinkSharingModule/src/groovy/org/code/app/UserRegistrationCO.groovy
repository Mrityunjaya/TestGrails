package org.code.app

import grails.validation.Validateable

/**
 * Created by mj on 19/1/16.
 */
@Validateable
class UserRegistrationCO {
    String firstName;
    String lastName;
    String email;
    String username;
    String password;
    String confirmPassword;
    File file;

    static constraints = {
        username nullable: false, blank: false, minSize: 6
        password nullable: false, blank: false, minSize: 6
        file nullable: true
        confirmPassword(validator: { val, obj ->
            return val.equals(obj.password)
        })
    }
}
