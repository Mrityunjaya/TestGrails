package com.src.main.user

class User {
    String email;
    String username;
    String password;
    String firstName;
    String lastName;
    byte photo;
    boolean admin;
    boolean active;
    Date dateCreated;
    Date lastUpdated;


    static constraints = {
        email email: true, unique: true
        photo nullable:true
    }
}
