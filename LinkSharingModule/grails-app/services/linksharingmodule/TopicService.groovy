package linksharingmodule

import com.src.main.resource.Topic
import com.src.main.user.User
import grails.transaction.Transactional

@Transactional
class TopicService {

    def serviceMethod() {

    }

    List<Topic> getTopicsByUser(User user) {
        return Topic.findAllByCreatedBy(user)
    }


    def addTopic(Topic topic) {
        try {
            topic.save()
            return true;
        } catch (Exception e) {
//            Throw new RuntimeException("Can not Add Topic", e.message)
            return false;
        }
    }
}
