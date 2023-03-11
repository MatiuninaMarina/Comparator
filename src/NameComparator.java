import java.util.Comparator;

public class NameComparator implements Comparator<Person> {
    private final int maxWords;

    public NameComparator(int maxWords) {
        this.maxWords = maxWords;
    }
    @Override
    public int compare(Person o1, Person o2) {
        int length1 = o1.getSurname().split(" ").length;
        int length2 = o2.getSurname().split(" ").length;
        boolean longSurnames = length1>=maxWords && length2>=maxWords;
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
        } else if  ((length2 > length1 || length1>length2) && longSurnames) {
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
}
