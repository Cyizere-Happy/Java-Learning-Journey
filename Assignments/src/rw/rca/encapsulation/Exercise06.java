package rw.rca.encapsulation;

public class Exercise06 {

    public static void main(String[] args) {

        User user1 = new User("John Doe", 15);
        User user2 = new User("Claire Mary", 18);
        User user3 = new User("Mugisha Jordan", 17);

        System.out.println(user1.getName());
        System.out.println(user2.getName());
        System.out.println(user3.getName());

        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);

        User u1 = new User("John Doe", 15);
        User u2 = new User("Furaha Divin", 49);
        User u3 = new User("John Doe", 15);

        System.out.println(u1 == u3);
        System.out.println(u1.equals(u3));
        System.out.println(u1.equals(u3));
    }
}
