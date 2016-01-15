package com.src.main.resource

class LinkResource extends Resource {
    String url;
    static constraints = {
        url url: true;
    }
}
