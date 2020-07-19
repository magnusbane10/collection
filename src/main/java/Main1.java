import exercitiu.Angajat;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main1 {
    public static void main(String[] args) {
        Somer somer1 = new Somer("Ion");
        Somer somer2 = new Somer("I");

        Angajat angajat1 = new Angajat(1000);
        Angajat angajat2= new Angajat(3000);

        Student student1 = new Student("Vasile");
        Student student2 = new Student("V");

        Person p1 = new Person(somer1,angajat1,student1);
        Person p2 = new Person(somer2,angajat2,student2);

        List<Person> personList = new ArrayList<>();
        personList.add(p1);
        personList.add(p2);

        for (Person person : personList) {
            System.out.println(person);
        }
    }
}
