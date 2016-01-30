package org.code.app

import grails.validation.Validateable

/**
 * Created by mj on 22/1/16.
 */
@Validateable
class TopicCO {
    String name;
    Visibility visibility;
}
