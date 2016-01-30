package linksharingmodule

import com.src.main.resource.Resource
import com.src.main.resource.Topic
import com.src.main.user.User
import grails.transaction.Transactional

@Transactional
class ResourceService {

    def serviceMethod() {

    }

    List<Resource> getResourcesByUser(User user) {
        return Resource.findAllByCreatedBy(user);
    }


    boolean addResource(Resource resource) {
        try {
            resource.save(failOnError: true)
            return true;
        } catch (Exception e) {
            throw new RuntimeException("Can not Add link " + e.message)
            return false;
        }
    }

    List<Resource> getResourcesByTopic(Topic topic) {
        return Resource.findAllByTopic(topic);
    }
}
