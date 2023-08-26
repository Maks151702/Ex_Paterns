package BehavioralPatterns.Mediator;

import java.util.ArrayList;
import java.util.List;

public class TextChat implements Chat{
    User admin;
    List<User> users = new ArrayList<>();

    public void setAdmin(User admin) {
        this.admin = admin;
    }

    public void addUserChat(User users) {
        this.users.add(users);
    }

    @Override
    public void sendMessage(String message, User user) {
        for(User u: users){
            if(u!=user){
                u.getMessage(message);
            }
        }
        admin.getMessage(message);
    }
}
