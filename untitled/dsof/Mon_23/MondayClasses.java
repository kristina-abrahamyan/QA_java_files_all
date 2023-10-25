public class MondayClasses {
    private int favNumber;
    private String name;
    private String colour;

    private static int numOfPeople = 0;

    public MondayClasses(){
        this(4, "James", "red");
        ++numOfPeople;
    }

    public MondayClasses(int favNumber, String name, String colour){
        this.favNumber = favNumber;
        this.name = name;
        this.colour = colour;
        ++numOfPeople;
    }


    public int getFavNumber() {
        return favNumber;
    }

    public void setFavNumber(int favNumber) {
        this.favNumber = favNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public static int getNumOfPeople(){
        return numOfPeople;
    }

    public static void incrementNumOfPeople(){
        numOfPeople++;
    }




    @Override
    public String toString() {
        return name + "'s" + " favourite number is " + favNumber + "\n" +
                "their favourite colour is " + colour;
    }
}
