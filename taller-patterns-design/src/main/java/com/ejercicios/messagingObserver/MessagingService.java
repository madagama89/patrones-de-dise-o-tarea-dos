package main.java.com.ejercicios.messagingObserver;

import java.util.HashMap;
import java.util.Map;

public class MessagingService {
    private Map<String, User> users;

    public MessagingService() {
        this.users = new HashMap<>();
    }

    public void registerUser(User user) {
        users.put(user.getId(), user);
    }

    public void sendMessage(String userId, Message message) {
        User user = users.get(userId);
        if (user != null) {
            user.notifyDevices(message);
        }
    }
}
