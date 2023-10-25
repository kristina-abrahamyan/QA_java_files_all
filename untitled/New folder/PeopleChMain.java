import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * @author Admin
 * @date 20/10/2023
 * @project java_intro
 */
public class PeopleChMain {
    public static void main(String[] args) {

        PeopleCh.numberOfPeople+=1;
        ArrayForPeople allPeople = new ArrayForPeople();
        String firstname;
        String lastname;
        Date dob;
        String answer = "y";

        Scanner keyboard = new Scanner(System.in);

        if (answer.equals("y")) {
            System.out.println("What's your first name?");
            firstname = keyboard.nextLine();
            System.out.println("What's your last name?");
            lastname = keyboard.nextLine();
            System.out.println("What's your DOB? In the format of mm/dd/yyyy");
            dob = new Date(keyboard.nextLine());
            System.out.println("Will you add a new person?[y/n]");
            answer = keyboard.nextLine().toLowerCase();
            PeopleCh person = new PeopleCh(firstname, lastname, dob);
            allPeople.addingToArray(person);
        }

        for (int i = 0; i < PeopleCh.numberOfPeople; i++){
            System.out.println(allPeople.getPerson(i));
        }

        for(PeopleCh being: allPeople.getPeople()){
            System.out.println(being);
        }


        System.out.println("Total number of people is: " + PeopleCh.numberOfPeople);
        //System.out.println("Person's information: " + person);
    }
}
