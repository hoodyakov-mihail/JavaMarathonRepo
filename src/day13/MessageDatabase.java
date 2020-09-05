package day13;

import java.util.ArrayList;

public class MessageDatabase {
    private static ArrayList<Message> messages = new ArrayList<>();

    public static void sendMessage(User u1, User u2, String text) {
        messages.add(new Message(u1,u2,text));
    }

    public static void showDialog(User u1, User u2) {
        ArrayList<Message> userMessages = new ArrayList<>();
        for (int i = 0; i < messages.size() ; i++) {
            if(messages.get(i).getSender().equals(u1) && messages.get(i).getReceiver().equals(u2)) userMessages.add(messages.get(i));
            else if(messages.get(i).getSender().equals(u2) && messages.get(i).getReceiver().equals(u1)) userMessages.add(messages.get(i));
        }
        for (Message message:userMessages) {
            System.out.println(message.getSender() + ": " + message.getText());
        }
    }
}
