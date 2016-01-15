package com.src.main.activity

import com.src.main.resource.Topic
import com.src.main.user.User
import org.code.app.Seriousness

class Subscription {
    Topic topic;
    User user;
    Seriousness seriousness;
    Date dateCreated;
//    static belongsTo = [user: User, topic: Topic]
    static constraints = {
        user unique: ['topic']
    }
}
