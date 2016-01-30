package linksharingmodule

import com.src.main.activity.Subscription
import com.src.main.resource.ReadingItem
import com.src.main.resource.Resource
import com.src.main.resource.ResourceRating
import com.src.main.resource.Topic
import com.src.main.user.User
import grails.transaction.Transactional

@Transactional
class UserService {
    def topicService;
    def resourceService;
    def subscriptionService;
    def resourceRatingService;
    def readingItemService;

    boolean addUser(User user) {
        try {
            user.save()
            return true;
        } catch (Exception e) {
//            Throw new RuntimeException("Can not Add User", e.message)
            return false;
        }
    }

    def getUserByNameOrEmail(String userName) {
        User user = User.findByUsername(userName)
        if (user == null) {
            user = User.findByEmailIlike(userName)
            if (user != null) {
                int emailDomainStartIndex = user.email.indexOf('@')
//                println user.email.substring(0, emailDomainStartIndex) + "---UserService---okokokokok"
                if (user.email.substring(0, emailDomainStartIndex).equals(userName)) {
                    return user
                }
            }
        }
        return user;
    }

    def updatePassword(User user, String newPswd) {
        try {
            user.password = newPswd
            user.save()
            return true;
        } catch (Exception e) {
//            Throw new RuntimeException("Can not Update User", e.message)
            return false;
        }
    }

    def getUserById(long id) {
        return User.findById(id);
    }


    def getDataForUser(long userId) {
        User user = getUserById(userId)
        List<Subscription> subscriptions = subscriptionService.getSubscriptionsByUser(user);
        List<ReadingItem> readingItems = readingItemService.getReadingItemsByUser(user);
        List<Topic> topicsCreated = topicService.getTopicsCreatedByUser(user);
        List<Topic> topicsSubscribed = subscriptionService.getTopicsSubscribedByUser(user);
        List<Resource> resources = resourceService.getResourcesByUser(user);
        List<ResourceRating> resourceRatings = resourceRatingService.getResourceRatingsByUser(user);
        Map userData = ["subscriptions"   : subscriptions, "readingItems": readingItems, "topicsCreated": topicsCreated,
                        "topicsSubscribed": topicsSubscribed, "resources": resources, "resourceRatings": resourceRatings]
        return userData;
    }
}
