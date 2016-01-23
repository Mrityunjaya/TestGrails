package linksharingmodule

import com.src.main.resource.Resource
import com.src.main.user.User
import grails.transaction.Transactional

@Transactional
class ResourceService {

    def serviceMethod() {

    }

    List<Resource> getResourcesByUser(User user) {
        return Resource.findAllByCreatedBy(user);
    }
}
