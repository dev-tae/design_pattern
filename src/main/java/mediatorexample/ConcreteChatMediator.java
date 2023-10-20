package main.java.mediatorexample;

import java.util.ArrayList;
import java.util.List;


public class ConcreteChatMediator implements ChatMediator {
    private List<User> users;

    public ConcreteChatMediator() {
        this.users = new ArrayList<>();
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }
    @Override
    public void sendMessage(String message, User user) {
        for (User u : users) {
            if (u != user) {
                u.receive(message);
            }
        }
    }
}
