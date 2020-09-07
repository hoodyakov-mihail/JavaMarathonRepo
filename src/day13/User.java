package day13;

import java.util.ArrayList;

public class User {
    private String username;
    private ArrayList<User> subscriptions;

    public User(String username) {
        this.username = username;
        this.subscriptions = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }
    public ArrayList<User> getSubscriptions() {
        return subscriptions;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public void setSubscriptions(ArrayList<User> subscriptions) {
        this.subscriptions = subscriptions;
    }

    public void subscribe(User user) {
        subscriptions.add(user);
    }
    public boolean isSubscribed(User user) {
        return subscriptions.contains(user);
    }
    public boolean isFriend(User user) {
        if (user.subscriptions.contains(this) && this.subscriptions.contains(user)) return true;
        else return false;
    }
    public void sendMessage(User user, String text) {
        MessageDatabase.sendMessage(this,user,text);
    }
    @Override
    public String toString() {
        return username;
    }
}
