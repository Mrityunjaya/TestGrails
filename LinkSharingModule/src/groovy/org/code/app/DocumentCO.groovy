package org.code.app

import com.src.main.resource.Topic
import grails.validation.Validateable
import org.springframework.web.multipart.MultipartFile

/**
 * Created by mj on 22/1/16.
 */
@Validateable
class DocumentCO {
    MultipartFile fileName;
    String description;
    Topic topic

    static constraints = {
        description nullable: true
    }
}
