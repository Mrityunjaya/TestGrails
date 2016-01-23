package linksharingmodule

import com.src.main.resource.ReadingItem
import com.src.main.user.User
import grails.transaction.Transactional

@Transactional
class ReadingItemService {

    def serviceMethod() {

    }

    List<ReadingItem> getReadingItemsByUser(User user) {
        return ReadingItem.findAllByUser(user);
    }
}
