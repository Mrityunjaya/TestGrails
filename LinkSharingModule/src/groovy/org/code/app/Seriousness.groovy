package org.code.app

/**
 * Created by mj on 15/1/16.
 */
enum Seriousness {
    SERIOUS(1, "serious"),
    VERY_SERIOUS(2, "very serious"),
    CASUAL(3, "casual")

    int id;
    String description;

    public Seriousness(int id, String desc){
        this.id = id;
        this.description = desc;
    }


}

