package linksharingmodule

import com.src.Constants
import com.src.main.activity.Subscription
import com.src.main.resource.DocumentResource
import com.src.main.resource.LinkResource
import com.src.main.resource.Resource
import com.src.main.resource.Topic
import com.src.main.user.User
import org.code.app.DocumentCO
import org.code.app.InvitationCO
import org.code.app.LinkCO
import org.code.app.TopicCO
import org.codehaus.groovy.grails.web.servlet.mvc.GrailsWebRequest

class HomeController {
    def userService;
    def topicService;
    def mailService;
    def resourceService;
    def subscriptionService;

    def index() {
        if (session['user'] == null) {
            showUnloggedPage();
        } else {
            showUserHomePage();
        }
    }

    def showUserHomePage() {
        Map userData = userService.getDataForUser(session['userId'])
        render([view: "/login/homePage", model: userData])
    }

    def logout() {
        session.invalidate()
        GrailsWebRequest.lookup(request).session = null
        showUnloggedPage();
        //render([view: "/index", model: ["tmplObjects": [1, 2, 3, 4]]])
    }

    def pageTraversal() {
        String pageName = params.userPage;
        println pageName;
        switch (pageName) {
            case "Profile":
//                showUserHomePage();
                redirect(action: "showUserHomePage")
                break;
            case "Users":
//                showAdminUserPage();
                redirect(action: "showAdminUserPage")
                break;
            case "Topics":
//                showTrendingTopics();
                redirect(action: "showTrendingTopics");
                break;
            case "Posts":
//                showUserPosts();
                redirect(action: "showUserPosts");
                break;
            case "Logout":
//                redirect(action: "showUnloggedPage");
                logout();
                break;
            default:
                println "Page requested is not in list";
                throw new RuntimeException("PageRequest Not Available")
                break;
        }
    }


    def showAdminUserPage() {
        //TODO
    }

    def showTrendingTopics() {
        Map userData = userService.getDataForUser(session['userId'])
        List<Topic> trendingTopics = topicService.getTrendingTopics(Constants.numLimit);

        render([view: "/home/topics", model: ["topics": trendingTopics, 'userData': userData]])
    }

    def showUserPosts() {
        Map userData = userService.getDataForUser(session['userId'])
        render([view: "/home/posts", model: userData])
    }

    def unsubscribe() {
        User user = userService.getUserById(session['userId']);
        Topic topic = topicService.getTopicByTopicName(params.topic);
        Subscription subscription = subscriptionService.getSubscriptionByUserAndTopic(user, topic);
        subscription.delete();
        showTrendingTopics();
    }

    def subscribe() {
        User user = userService.getUserById(session['userId']);
        Topic topic = topicService.getTopicByTopicName(params.topic);
        if (subscriptionService.addUserSubscription(user, topic)) {
            flash.message = "User Subscribed to " + topic.name;
        } else {
            flash.message = "User Not Subscribed to " + topic.name
        }
        showTrendingTopics();
    }

    def showUnloggedPage() {
        render([view: "/index", model: ["tmplObjects": [1, 2, 3, 4]]]);
    }

    def createTopic(org.code.app.TopicCO topicCO) {
        Topic topic = new Topic(topicCO.properties)
        topic.createdBy = userService.getUserById(session['userId'])
        if (topicService.addTopic(topic)) {
            flash.message = ("Topic Added Succesfully");
        } else {
            flash.message = ("Topic Not Added Succesfully");
        }
        redirect(controller: "home", action: "showUserHomePage")
    }

    def sendInvitation(InvitationCO invitationCO) {
        mailService.sendMail {//TODO
            to invitationCO.email
            subject "Hello Fred"
            body 'How are you?'
        }
        if (invitationCO.validate()) {
            flash.message = ("Mail Sent");
        } else {
            flash.message = ("Mail Not Sent");
        }
        redirect(controller: "home", action: "showUserHomePage")
    }

    def createLink(LinkCO linkCO) {
        Resource resource = new LinkResource(linkCO.properties);
        resource.createdBy = userService.getUserById(session['userId'])
        if (resourceService.addResource(resource)) {
            flash.message = ("Link Added Succesfully");
        } else {
            flash.message = ("Link Not Added Succesfully");
        }
        redirect(controller: "home", action: "showUserHomePage")
    }

    def createDocument(DocumentCO documentCO) {
        Resource resource = new DocumentResource(documentCO.properties);
        resource.filePath = Constants.fileStorePath + documentCO.fileName.name;
        documentCO.fileName.transferTo(new File(resource.filePath));
        resource.createdBy = userService.getUserById(session['userId'])
        if (resourceService.addResource(resource)) {
            flash.message = ("Document Added Succesfully");
        } else {
            flash.message = ("Document Not Added Succesfully");
        }
        redirect(controller: "home", action: "showUserHomePage")
    }

}
