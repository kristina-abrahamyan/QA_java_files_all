/**
 * @author Admin
 * @date 18/10/2023
 * @project java_intro
 */


import java.util.Arrays;
import java.util.Scanner;
public class in_class {
    public static void main (String[] args){
        int[] array;
        array = new int[6];

        Scanner obj = new Scanner(System.in);
        System.out.println("Type 6 numbers");

        for (int i = 0; i < 6; i++){
            int input = obj.nextInt();
            obj.nextLine();
            array[i] = input;
        }

        System.out.println("Printing array in reverse order:");

        for (int i = 5; i >= 0; i--){
            System.out.println(array[i]);
        }

        System.out.println("Sorting and printing in asc order:");

        //sorting and printing in ascending order//
        Arrays.sort(array);
        for (int i = 0; i < 6; i++){
            System.out.println(array[i]);
        }

        System.out.println("Printing every second number:");

        //printing every second number//
        for (int i = 0; i < 6; i += 2){
            System.out.println(array[i]);
        }
    }
}
