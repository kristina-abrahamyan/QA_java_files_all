import java.awt.image.BandCombineOp;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Admin
 * @date 19/10/2023
 * @project java_intro
 */
public class Shopping {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        Trolley myTrolley = new Trolley();

        String name;
        int quantity;
        String description;
        float price;

        String another;
        do {
            System.out.println("Type item name");
            name = obj.nextLine();
            System.out.println("Type quantity");
            quantity = obj.nextInt();
            obj.nextLine();
            System.out.println("Type description");
            description = obj.nextLine();
            System.out.println("Type price");
            price = obj.nextFloat();
            obj.nextLine();
            myTrolley.putAllItems(name, quantity, description, price);
            System.out.println("Would you like to enter another item y/n");
            another = obj.nextLine().toLowerCase();
        }
        while (another.equals("y"));

        System.out.println("VAT is: " + myTrolley.VAT());
        System.out.println("Total (excl. VAT) is: " + myTrolley.total());
    }
}
