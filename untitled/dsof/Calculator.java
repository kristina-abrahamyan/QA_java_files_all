import java.util.Scanner;

/**
 * @author Admin
 * @date 19/10/2023
 * @project java_intro
 */


public class Calculator {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Type numbers");

        int input1 = Integer.parseInt(obj.nextLine());
        int input2 = Integer.parseInt(obj.nextLine());

        System.out.println("Type an operator");
        String operator = obj.nextLine();

        switch (operator) {
            case "+" -> System.out.println(input1 + input2);
            case "-" -> System.out.println(input1 - input2);
            case "*" -> System.out.println(input1 * input2);
            case "/" -> System.out.println(input1 / input2);
            default -> System.out.println("Invalid input.");
        }
    }
}
