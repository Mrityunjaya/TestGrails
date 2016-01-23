package linksharingmodule

import com.src.main.resource.ResourceRating
import com.src.main.user.User
import grails.transaction.Transactional

@Transactional
class ResourceRatingService {

    def serviceMethod() {

    }

    List<ResourceRating> getResourceRatingsByUser(User user) {
        return ResourceRating.findAllByUser(user);
    }
}
