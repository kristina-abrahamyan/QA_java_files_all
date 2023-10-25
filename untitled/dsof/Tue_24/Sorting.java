package Tue_24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorting {
    public static void main(String[] args) {

        List<Employee> empl = new ArrayList<>();
        empl.add(new Employee("Bob", 56));
        empl.add(new Employee("Sam", 23));
        empl.add(new Employee("Kristina", 25));

//        // Sorting without compare
//        for (int i = 0; i < empl.size(); i++) {
//            for (int j = empl.size() - 1; j > i; j--) {
//                if (empl.get(i).age > empl.get(j).age) {
//                    Employee tmp = empl.get(i);
//                    empl.set(i, empl.get(j));
//                    empl.set(j, tmp);
//                }
//            }
//        }


        Collections.sort(empl, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.age - o2.age;
            }
        });


        for (Employee i: empl) {
            System.out.println(i);
        }

    }
}
class Employee{
    String name;
    int age;

    public Employee (String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}