package com.src.main.resource

import com.src.main.user.User

abstract class Resource {
    String description;
    User createdBy;
    Topic topic;
    Date dateCreated;
    Date lastUpdated;

    static constraints = {
        description maxSize: 1024, nullable: true
    }
}
