package ua.kiev.prog;

import java.util.*;

public class ChatRooms {
    private static Map<String, TreeSet<String>> roomList = new HashMap<>();

    public static void addUser(String room, String login, String ... params) {
        roomList.putIfAbsent(room, new TreeSet<>(Arrays.asList(new String[]{login})));
        Set<String> roomMembers = roomList.get(room);
        for (String i : params) {
            if (LoginData.userExists(i)) {
                roomMembers.add(i);
            }
        }
    }

    public static boolean exists(String room) {
        return roomList.containsKey(room);
    }

    public static boolean userIsInRoom(String username, String room) {
        if (!roomList.containsKey(room)) {
            return false;
        }
        if (roomList.get(room).contains(username)) {
            return true;
        } else return false;
    }
}
