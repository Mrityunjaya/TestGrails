package com.src.main.resource

import com.src.main.user.User
import org.code.app.Visibility

class Topic {
    String name;
    User createdBy;
    Date dateCreated;
    Date lastUpdated;
    Visibility visibility;

    static constraints = {
        name unique: true
    }
}
