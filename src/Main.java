import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> clubMembers = new ArrayList<Person>();
        clubMembers.add(new Person("mikael", 182));
        clubMembers.add(new Person("matti", 187));
        clubMembers.add(new Person("joel", 184));

        System.out.println(clubMembers);
        Collections.sort(clubMembers);
        System.out.println(clubMembers);

    }
}
