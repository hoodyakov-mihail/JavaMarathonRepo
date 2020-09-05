package day13;

public class Test {
    public static void main(String[] args) {
        User user1 = new User("Джон");
        User user2 = new User("Майк");
        User user3 = new User("Фредди");

        user1.sendMessage(user2,"Эй Майк, привет");
        user1.sendMessage(user2,"Как дела?");
        user2.sendMessage(user1,"Привет Джон");
        user2.sendMessage(user1,"Всё отлично");
        user2.sendMessage(user1,"Даже замечательно");
        user3.sendMessage(user1,"Yo");
        user3.sendMessage(user1,"sup?");
        user3.sendMessage(user1,"aright?");
        user3.sendMessage(user1,"good");
        user1.sendMessage(user3,"Yo");
        user1.sendMessage(user3,"do my best");
        user1.sendMessage(user3,"yap");

        MessageDatabase.showDialog(user1,user3);

        user1.subscribe(user2);
        user1.subscribe(user3);
        System.out.println(user1.getSubscriptions());
        System.out.println(user2.isFriend(user1));
    }
}
