package linksharingmodule

import com.src.main.activity.Subscription
import com.src.main.resource.Topic
import com.src.main.user.User
import grails.transaction.Transactional
import org.code.app.Seriousness

@Transactional
class SubscriptionService {
    def topicService;

    def serviceMethod() {

    }

    List<Subscription> getSubscriptionsByUser(User user) {
        return Subscription.findAllByUser(user);
    }

    List<Topic> getTopicsSubscribedByUser(User user) {
        List<Subscription> subscriptions = Subscription.findAllByUser(user);
        List<Topic> topics = new ArrayList<Topic>();
        for (Subscription subscription : subscriptions) {
            topics.add(subscription.topic);
        }
        return topics;
    }


    List<Subscription> getSubscriptionsByTopic(Topic topic) {
        return Subscription.findAllByTopic(topic);
    }

    Subscription getSubscriptionByUserAndTopic(User user, Topic topic) {
        return Subscription.findByUserAndTopic(user, topic);
    }

    boolean addUserSubscription(User user, Topic topic, Seriousness seriousness = Seriousness.CASUAL) {
        Subscription subscription = new Subscription();
        subscription.seriousness = seriousness;
        subscription.topic = topic;
        subscription.user = user;
        return addSubscription(subscription);
    }

    boolean addSubscription(Subscription subscription) {
        try {
            subscription.save()
            return true;
        } catch (Exception e) {
//            Throw new RuntimeException("Can not Add User", e.message)
            return false;
        }
    }
}
