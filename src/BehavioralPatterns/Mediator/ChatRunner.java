package BehavioralPatterns.Mediator;

public class ChatRunner {
    public static void main(String[]args){
        TextChat chat = new TextChat();

        User admin = new Admin(chat,"Admin");

        User user1 = new SimpleUser(chat,"User1");
        User user2 = new SimpleUser(chat,"User2");

        chat.setAdmin(admin);
        chat.addUserChat(user1);
        chat.addUserChat(user2);

        user1.sendMessage("Hello, I am user1.");
        admin.sendMessage("Roger that. I am admin!");

    }
}
