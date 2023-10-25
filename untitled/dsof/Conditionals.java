/**
 * @author Admin
 * @date 18/10/2023
 * @project java_intro
 */
import java.util.Scanner;
public class Conditionals {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Type two numbers separated with enter: ");

        int num1 = obj.nextInt();
        obj.nextLine();
        int num2 = obj.nextInt();
        obj.nextLine();

        if (num1 > num2) {
            System.out.println("Number 1: " + num1 + " bigger");
        } else {
            System.out.println("Number 2: " + num2 + " is bigger");
        }

        System.out.println("Type 3rd number");
        int num3 = obj.nextInt();
        obj.nextLine();

        if (num3 % 2 == 0){
            System.out.println("Your 3rd number is even");
        } else {
            System.out.println("Your 3rd number is odd");
        }


        System.out.println("Type green or red");
        String colour = obj.nextLine();

        String green ="green";
        if (colour.equals(green)){
            System.out.println("Green means go");
        } else{
            System.out.println("Red means stop");
        }
    }
}
