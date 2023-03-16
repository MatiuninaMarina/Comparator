import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Person person2 = new Person("Vika", "Litvinenko", 9);
        Person person = new Person("Zhenya", "Voronina", 15);
        Person person1 = new Person("Alisa", "Avdeeva Aprelkina", 5);
        Person person3 = new Person("Marina", "Voronina-Sokolova-Matyunina", 17);
        Person person4 = new Person("Nadezhda", "Vihanova-Ivanova-Petrova-Seleznyova", 18);
        Person person5 = new Person("Vera", "Denisov Ivanova Petrova Seleznyova Strelcova", 4);
        ArrayList<Person> listOfPeople = new ArrayList<>();
        listOfPeople.add(person3);
        listOfPeople.add(person4);
        listOfPeople.add(person5);
        listOfPeople.add(person);
        listOfPeople.add(person1);
        listOfPeople.add(person2);
        int maxWords = 3;
        listOfPeople.sort((o1, o2) -> {
                    int length1 = o1.getSurname().split(" |-").length;
                    int length2 = o2.getSurname().split(" |-").length;
                    boolean longSurnames = length1 >= maxWords && length2 >= maxWords;
                    if (length2 == length1) {
                        if (o1.getAge() > o2.getAge()) {
                            return 1;
                        } else if (o2.getAge() > o1.getAge()) {
                            return -1;
                        } else {
                            return 0;
                        }

                    } else if (length2 > length1 && !longSurnames) {
                        return -1;
                    } else if ((length2 > length1 || length1 > length2) && longSurnames) {
                        if (o1.getAge() > o2.getAge()) {
                            return 1;
                        } else if (o2.getAge() > o1.getAge()) {
                            return -1;
                        } else {
                            return 0;
                        }
                    } else {
                        return 1;
                    }
                }
        );
        System.out.println(listOfPeople);
    }
}
