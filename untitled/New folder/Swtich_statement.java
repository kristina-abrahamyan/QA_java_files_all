import java.util.Scanner;

/**
 * @author Admin
 * @date 19/10/2023
 * @project java_intro
 */


public class Swtich_statement {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);

        System.out.println("Type a number between 1 and 12");
        int input = obj.nextInt();

        switch (input) {
            case 1, 2, 12 -> System.out.println("Winter!");
            case 3, 4, 5 -> System.out.println("Spring!");
            case 6, 7, 8 -> System.out.println("Summer!");
            case 9, 10, 11 -> System.out.println("Autumn");
            default -> System.out.println("Invalid input.");
        }


    }
}
