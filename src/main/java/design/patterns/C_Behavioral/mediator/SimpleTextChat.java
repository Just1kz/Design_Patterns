package design.patterns.C_Behavioral.mediator;

import java.util.HashSet;
import java.util.Set;

public class SimpleTextChat implements Chat {
    private User admin;
    private final Set<User> users = new HashSet<>();

    public void setAdmin(User admin) {
        this.admin = admin;
    }

    public void addUser(User user) {
        this.users.add(user);
    }

    @Override
    public void sendMessage(String message, User user) {
        users.stream()
                .filter(x->!x.equals(user))
                .forEach(x->x.getMessage(message));
        admin.getMessage(message);
    }
}
