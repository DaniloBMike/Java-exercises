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


        familyNames.remove(3);

        boolean evazia = familyNames.isEmpty();

        int tamanho = familyNames.size();

        boolean have = familyNames.contains("Danilo");

        System.out.println("The list is empty ? " + evazia + " What is the size of the list ? " + tamanho
                + " Is Danilo a name of the list? " + have);

        for (String names2 : familyNames) {
            System.out.println(names2);
        }

        familyNames.clear();
        System.out.println("The list is empty now? " + familyNames.isEmpty());


                familyNames.forEach(identity -> System.out.println(identity));
    }
}
