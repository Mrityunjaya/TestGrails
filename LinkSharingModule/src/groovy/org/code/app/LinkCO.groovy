package org.code.app

import com.src.main.resource.Topic
import grails.validation.Validateable

/**
 * Created by mj on 22/1/16.
 */
@Validateable
class LinkCO {

    String url;
    String description;
    Topic topic

    static constraints = {
        url url: true
        description nullable: true
    }
}
