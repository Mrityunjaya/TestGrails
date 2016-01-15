/**
 * Created by mj on 15/1/16.
 */
package org.code.app;

enum Visibility {
    PRIVATE(1, "Private"),
    PUBLIC(2, "Public");

    int id;
    String description;

    public Visibility(int id, String desc){
        this.id = id;
        this.description = desc;
    }
}
