package org.code.app

import grails.validation.Validateable

/**
 * Created by mj on 20/1/16.
 */
@Validateable
class UserResetPswdCO {
    String name;
    String pswd;
    String confirmPswd;
    static constraints = {
        name nullable: false, blank: false, minSize: 6
        pswd nullable: false, blank: false, minSize: 6
        confirmPswd(validator: { val, obj ->
            return val.equals(obj.pswd)
        })
    }
}
