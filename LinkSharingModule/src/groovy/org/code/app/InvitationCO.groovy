package org.code.app

import com.src.main.resource.Topic
import grails.validation.Validateable

/**
 * Created by mj on 22/1/16.
 */
@Validateable
class InvitationCO {
    String email;
    Topic topic;

    static constraints = {
        email email: true
    }

}
