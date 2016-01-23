package linksharingmodule

import com.src.main.activity.Subscription
import com.src.main.resource.ReadingItem
import com.src.main.resource.Resource
import com.src.main.resource.ResourceRating
import com.src.main.resource.Topic
import com.src.main.user.User
import org.code.app.DocumentCO
import org.code.app.InvitationCO
import org.code.app.LinkCO
import org.code.app.TopicCO
import org.codehaus.groovy.grails.web.servlet.mvc.GrailsWebRequest

class HomeController {
    def userService;

    def index() {
        if (session['user'] == null) {
            showUnloggedPage();
        } else {
            showUserHomePage();
        }
    }

    def showUserHomePage() {
        Map userData = userService.getDataForUser(session['userId'])
//            println userData.toString()+"-=-=-=-=";
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
                showUserHomePage();
                break;
            case "Topics":
                showUserTopics();
                break;
            case "Posts":
                showUserPosts();
                break;
            case "Logout":
                logout();
                break;
            default:
                println "Page requested is not in list";
                throw new RuntimeException("PageRequest Not Available")
                break;
        }
    }

    def showUserTopics() {
        Map userData = userService.getDataForUser(session['userId'])
        render([view: "/home/topics", model: userData])
    }

    def showUserPosts() {
        Map userData = userService.getDataForUser(session['userId'])
        render([view: "/home/posts", model: userData])
    }

    def showUnloggedPage() {
        render([view: "/index", model: ["tmplObjects": [1, 2, 3, 4]]]);
    }

    def createTopic(TopicCO topicCO) {

    }

    def sendInvitation(InvitationCO invitationCO) {

    }

    def createLink(LinkCO linkCO) {

    }

    def createDocument(DocumentCO documentCO) {

    }

}
