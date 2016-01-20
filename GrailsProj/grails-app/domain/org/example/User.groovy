package org.example

class User {

    String name
    int age
    String dept

    static constraints = {
    }


    def lowerCase = { attr, body ->
        out << (attr.str as String)?.toLowerCase();
    }
}
