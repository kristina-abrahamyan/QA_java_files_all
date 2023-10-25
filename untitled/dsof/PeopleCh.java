import java.util.ArrayList;
import java.util.Date;
import java.util.ArrayList;

/**
 * @author Admin
 * @date 20/10/2023
 * @project java_intro
 */
public class PeopleCh {
    private String firstname;
    private String lastname;
    private Date dob;


    public static int numberOfPeople = 0;

    // constructor
    public PeopleCh(String firstname, String lastname, Date dob){
        this.firstname = firstname;
        this.lastname = lastname;
        this.dob = dob;
    }
    public PeopleCh(){

    }

    ///////////////////////////////////////////
    // getter functions
    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public Date getDob() {
        return dob;
    }

    ////////////////////////////////////////////
    // setter functions
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String toString(){
        return "The firstname is: " + this.getFirstname().toUpperCase() + "\n" +
                "The firstname is: " + this.getLastname().toUpperCase() + "\n" +
                "The firstname is: " + this.getDob();
    }

}
