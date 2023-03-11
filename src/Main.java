import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Person person2 = new Person("Vika", "Litvinenko", 9);
        Person person = new Person("Zhenya", "Voronina", 15);
        Person person1 = new Person("Alisa", "Avdeeva Aprelkina", 5);
        Person person3= new Person("Marina", "Voronina Sokolova Matyunina", 17);
        Person person4 = new Person("Nadezhda", "Vihanova Ivanova Petrova Seleznyava", 18);
        Person person5 = new Person("Vera", "Vihanova Ivanova Petrova Seleznyava Strelcova", 4);
        ArrayList<Person> listOfPeople = new ArrayList<>();
        listOfPeople.add(person3);
        listOfPeople.add(person4);
        listOfPeople.add(person5);
        listOfPeople.add(person);
        listOfPeople.add(person1);
        listOfPeople.add(person2);
        Collections.sort(listOfPeople, new NameComparator(3));
        System.out.println(listOfPeople);
        System.out.println();
    }
}