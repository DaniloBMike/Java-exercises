import java.util.ArrayList;
import java.util.List;

public class exerciselist {
    public static void main (String[] args) {

        List<String> names = new ArrayList<>();

            names.add("Danilo");
            names.add("Silvana");
            names.add("Vanessa");

        

        for (String name : names) {
            System.out.println("The names are : " + name);
        }

    }
}
