import com.src.main.activity.Subscription
import com.src.main.resource.DocumentResource
import com.src.main.resource.LinkResource
import com.src.main.resource.ReadingItem
import com.src.main.resource.Resource
import com.src.main.resource.ResourceRating
import com.src.main.resource.Topic
import com.src.main.user.User
import org.code.app.Seriousness
import org.code.app.Visibility

class BootStrap {

    def init = {
        //servletContext ->
        createUsers();
        createTopics();
        createResources();
        createReadingItems();
        createRatings();
        subscribeTopic();
    }
    def destroy = {
    }

    def createUsers() {
        User user = new User(firstName: "santa", lastName: "singh", email: "santasingh@tothenew.com",
                password: "abcdef", username: "santa");
        user.save();
    }

    def createTopics() {
        User user = new User(firstName: "banta", lastName: "singh", email: "bantasingh@tothenew.com",
                password: "abcdef", username: "banta")
        user.save()
        println user.errors.allErrors
        Topic topic = new Topic(name: "Topic1", visibility: Visibility.PUBLIC, createdBy: user)
        topic.save()
    }

    def createResources() {
        User user = new User(firstName: "motu", lastName: "singh", email: "motusingh@tothenew.com",
                password: "abcdef", username: "motu")
        user.save()
        println user.errors.allErrors
        Topic topic = new Topic(createdBy: user, name: "Art Url is Fun", visibility: Visibility.PUBLIC)
        topic.save()
        println topic.errors.allErrors
        Resource resource = new LinkResource(createdBy: user, description: "Test Resource", topic: topic, url: "http://abc.com")
        resource.save()
    }

    def createReadingItems() {
        User user = new User(firstName: "patlu", lastName: "singh", email: "patlusingh@tothenew.com",
                password: "abcdef", username: "patlu")
        user.save()
        Topic topic = new Topic(createdBy: user, name: "Art File is Fun", visibility: Visibility.PUBLIC)
        topic.save()
        Resource resource = new DocumentResource(createdBy: user, description: "Test Resource", topic: topic, filePath: "abc.txt")
        resource.save()
        println resource.errors.allErrors
        ReadingItem readingItem = new ReadingItem(user: user, resource: resource, isRead: false)
        readingItem.save()
    }

    def createRatings() {
        int score = 10;
        User user = new User(firstName: "lambu", lastName: "singh", email: "lambusingh@tothenew.com",
                password: "abcdef", username: "lambu")
        user.save()
        Topic topic = new Topic(createdBy: user, name: "Art File 2 is Fun", visibility: Visibility.PUBLIC)
        topic.save()
        Resource resource = new DocumentResource(createdBy: user, description: "Test Resource", topic: topic, filePath: "abc.txt")
        resource.save()
        ResourceRating resourceRating = new ResourceRating(resource: resource, user: user, score: score)
        resourceRating.save()
    }

    def subscribeTopic() {
        User user = new User(firstName: "chhotu", lastName: "singh", email: "chhotusingh@tothenew.com",
                password: "abcdef", username: "chhotu")
        user.save()
        Topic topic = new Topic(createdBy: user, name: "Topic2", visibility: Visibility.PUBLIC)
        topic.save()
        println topic.errors.allErrors
        Subscription subscription = new Subscription(user: user, topic: topic, seriousness: Seriousness.CASUAL)
        subscription.save()
    }

}
