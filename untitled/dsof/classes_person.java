/**
 * @author Admin
 * @date 19/10/2023
 * @project java_intro
 */

import java.util.Scanner;


public class classes_person {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        Person[] people = new Person[4];
        Person.numberOfPeople+=1;
//        Person daniel = new Person();
//        daniel.setAge(100);
//        System.out.println(daniel.getAge());
        String name;
        int age;
        String colour;

        for(int i = 0; i < 2; i++){
            System.out.println("Type your name");
            name = obj.nextLine();

            System.out.println("Type your favourite colour");
            colour = obj.nextLine();

            System.out.println("Type your age");
            age = Integer.parseInt(obj.nextLine());

            people[i] = new Person(name, age, colour);
            Person.numberOfPeople+=1;
        }

        System.out.println(Person.numberOfPeople);
        for(Person individual: people){
            System.out.println(individual);
        }

    }
}