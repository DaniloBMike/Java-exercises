import java.util.ArrayList;
import java.util.List;

public class collectionwitharray {
    public static void main (String[] args) {

        //Initiation of Arraylist

        List<String> familyNames = new ArrayList<>();
        familyNames.add("Danilo");
        familyNames.add("Vanessa");
        familyNames.add("Silvana");

        familyNames.add(2,"Enzo");

        for (String names : familyNames) {
            System.out.println(names);
        }

        String names = familyNames.get(3);
        System.out.println("The position name is : " + names);

    }
}
