/**
 * @author Admin
 * @date 18/10/2023
 * @project java_intro
 */
import java.util.Scanner;

public class Associative_array {
    public static void main(String[] args){

        Scanner obj = new Scanner(System.in);

        String[] array1 = new String[4]; //name//
        int[] array2 = new int[4];  //age//
        String[] array3 = new String[4]; //colour//

        // doing this for 4 people
        for (int i = 0; i <4; i++){
            int userNumber = i;
            System.out.println("User " + ++userNumber + " go ahead:");
            System.out.println("Type your name:");
            array1[i] = obj.nextLine();

            System.out.println("Type your age:");
            array2[i] = Integer.parseInt(obj.nextLine());

            System.out.println("Type your favourite colour:");
            array3[i] = obj.nextLine();
        }

        for (int i = 0; i <4; i++){
            System.out.println(array1[i] + array2[i] + array3[i]);
        }
    }
}
