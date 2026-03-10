import java.util.HashMap;

public class collectionhashmap {
    public static void main (String[] args) {

        HashMap<String, Double> money = new HashMap<>();
        money.put("Danilo" , 1.500);
        money.put("Vanessa" , 1.000);
        money.put("Silvana" , 3.000);

        for(String dinheiro : money.keySet()); {
            double cash = money.get(dinheiro);
            System.out.println(person + " : " + cash);
        }

    }
}