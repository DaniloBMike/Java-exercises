import java.util.HashMap;

public class collectionhashmap {
    public static void main (String[] args) {

        HashMap<String, Double> money = new HashMap<>();
        money.put("Danilo" , 1.500);
        money.put("Vanessa" , 1.000);
        money.put("Silvana" , 3.000);

        for( String person : money.keySet()); {
            double cash = money.get(person);
            System.out.println(person + " : " + cash);
        }

    }
}