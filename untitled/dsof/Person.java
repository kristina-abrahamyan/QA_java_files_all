/**
 * @author Admin
 * @date 19/10/2023
 * @project java_intro
 */
public class Person {
    // Declaring all the variables used in the class
    // They need to be private so that others cannot mess with the code
    private String name;
    private int age;
    private String colour;

    // static variables are fixed at a certain value and
    // they are pre-assigned to each object
    public static int numberOfPeople = 0;

    //Creating constructor - something that's called before functions
    // We know it's a constructor cuz it's within a class and has the same name as the class
    public Person(String name, int age, String colour){ // Here the variable names must correspond to the ones below
        this.name = name; // this.name should correspond to the variables created in the beginning of the class
        this.age = age;
        this.colour = colour;
    }

    // The constructor can be empty when we don't expect inputs to use the class
    public Person(){

    }



    // Then we create functions, these can be accessed by main
    public void setName(String personName) {
        this.name = name;
    }

    public String getName() {

        return this.name;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String toString(){
        return this.name + " " + this.age + " " + this.colour;
    }
}
