package design.patterns.C_Behavioral.mediator;

public class SimpleChatRunner {
    public static void main(String[] args) {
        SimpleTextChat chat = new SimpleTextChat();

        AbstractUser admin = new Admin(chat, "Admin");
        AbstractUser user1 = new SimpleUser(chat, "User1");
        AbstractUser user2 = new SimpleUser(chat, "User2");

        chat.setAdmin(admin);
        chat.addUser(user1);
        chat.addUser(user2);

        user1.sendMessage("Hello, I'm " + user1.getName());
        admin.sendMessage("Roger that. I'm, " + admin.getName());
    }
}
