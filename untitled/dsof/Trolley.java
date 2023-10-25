/**
 * @author Admin
 * @date 19/10/2023
 * @project java_intro
 */

import java.util.ArrayList;
public class Trolley {
    //instance variables
    private ArrayList<ItemClass> allItems = new ArrayList<ItemClass>();
    private float total;



    //constructor
    public Trolley(){

    }

    //functions
    public void putAllItems(String name, int quantity, String description, float price){

        ItemClass item = new ItemClass(name, quantity, description, price);
        allItems.add(item);
    }


    //Total calculation
    public double total(){
        for (int i = 0; i < this.allItems.size(); i++) {
            total = total + allItems.get(i).getPrice();
        }
        return total;
    }

    //VAT calculations
    public double VAT(){
        return (total * 0.2);
    }


}
