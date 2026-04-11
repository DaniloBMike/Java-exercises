 import java.util.ArrayList;
import java.util.List;

public class collectionwitharray {
    public static void main (String[] args) {

        List<String> names = new ArrayList<>();

            names.add("Danilo");
            names.add("Silvana");
            names.add("Vanessa");
            names.add("Enzo");
            names.add("Alice");
            names.add("Cecilia");

            names.add(1, "Manel coió");

            names.remove("Danilo");
            for (String name : names) {
                System.out.println(name);
            }

            String name = names.get(5); {
                System.out.println("The name is : " + name);
            }

            boolean isEmpty = names.isEmpty(); {
                System.out.println("Is empty : " + isEmpty );
            }

            int size = names.size(); {
                System.out.println("The size is : " + size);
            }

            System.out.println(" The name is : " + names.get(5));
    }
}