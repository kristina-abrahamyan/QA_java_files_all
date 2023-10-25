import java.util.ArrayList;
import java.util.Date;

/**
 * @author Admin
 * @date 20/10/2023
 * @project java_intro
 */
public class ArrayForPeople {
    private ArrayList<PeopleCh> people = new ArrayList<PeopleCh>();


    public ArrayForPeople(){

    }

    public void addingToArray(PeopleCh person){
        this.people.add(person);
    }

    public PeopleCh getPerson(int index){
        return this.people.get(index);
    }

    public ArrayList<PeopleCh> getPeople(){
        return this.people;
    }

}
