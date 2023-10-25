public class MainMonday {
    public static void main(String[] args) {

        MondayClasses user1 = new MondayClasses();

        MondayClasses user2 = new MondayClasses(4, "Bob", "Blue");

        System.out.println("User1 info: " + user1);
        System.out.println("User 2 info: " + user2);

        System.out.println(MondayClasses.getNumOfPeople());
    }
}
