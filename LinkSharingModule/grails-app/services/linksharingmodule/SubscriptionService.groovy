package linksharingmodule

import com.src.main.activity.Subscription
import com.src.main.user.User
import grails.transaction.Transactional

@Transactional
class SubscriptionService {

    def serviceMethod() {

    }

    List<Subscription> getSubscriptionsByUser(User user) {
        return Subscription.findAllByUser(user);
    }
}
