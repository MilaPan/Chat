package ua.kiev.prog;

import java.util.List;
import java.util.UUID;

public class ChatRoom {
    public UUID id;

    public ChatRoom() {
    }

    public ChatRoom(String name, String code, String type) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.code = code;
        this.type = type;
    }

    public String name;
    public String code;
    public List<User> users;
    //TODO: Create enum or class for type
    //type: private, public
    public String type;
    //TODO: send message to other users
    public void notify(UUID userId, Message message) {

    }
}
