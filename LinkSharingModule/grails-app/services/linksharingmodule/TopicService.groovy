package linksharingmodule

import com.src.Constants
import com.src.main.activity.Subscription
import com.src.main.resource.Topic
import com.src.main.user.User
import grails.transaction.Transactional
import org.code.app.Utility

@Transactional
class TopicService {

    def resourceService;
    def subscriptionService;

    def serviceMethod() {

    }

    List<Topic> getTopicsCreatedByUser(User user) {
        return Topic.findAllByCreatedBy(user)
    }

    List<Topic> getTopicsSubscribedByUser(User user) {
        return subscriptionService.getTopicsSubscribedByUser(user);
    }

    List<Topic> getAllTopics() {
        return Topic.findAll();
    }


    boolean addTopic(Topic topic) {
        try {
            topic.save()
            return true;
        } catch (Exception e) {
//            Throw new RuntimeException("Can not Add Topic", e.message)
            return false;
        }
    }

    List<Topic> getTrendingTopics(int numTopicLimit) {
        List<Topic> topics = Topic.findAll();
        int counter = 0;
        List<Topic> orderedTopics = new ArrayList<Topic>();
        Map<Topic> trendingTopics = new HashMap<Topic>();
        for (Topic topic : topics) {
            List<Subscription> resources = resourceService.getResourcesByTopic(topic);
            trendingTopics.put(topic.name, resources.size());
        }
        List<String> topicNames = Utility.getSortedMapByValue(trendingTopics).keySet().asList();
        for (String topicName : topicNames) {
            counter++;
            if (counter > numTopicLimit) {
                break;
            }
            Topic topic = getTopicByTopicName(topicName);
            orderedTopics.add(topic);
        }
        return orderedTopics;
    }

    Topic getTopicByTopicName(String name) {
        return Topic.findByName(name);
    }
}
