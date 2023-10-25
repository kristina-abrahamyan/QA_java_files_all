/**
 * @author Admin
 * @date 19/10/2023
 * @project java_intro
 */
public class ItemClass {
    //instance variables
    private String name;
    private int quantity;
    private String description;
    private float price;

    //constructor
    public ItemClass (String item, int quantity, String description, float price){
        this.name = item;
        this.quantity = quantity;
        this.description = description;
        this.price = price;
    }

    //functions
    public void setName(String item) {
        this.name = item;
    }
    public String getName() {
        return this.name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public int getQuantity() {
        return this.quantity;
    }


    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return this.description;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    public float getPrice() {
        return this.price;
    }

}
