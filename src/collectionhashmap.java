import java.util.HashMap;

public class collectionhashmap {
    public static void main (String[] args) {

        HashMap<String, Double> money = new HashMap<>();
        money.put("Danilo" , 1.500);
        money.put("Vanessa" , 1.000);
        money.put("Silvana" , 3.000);

        //Method (KEYSET) At (for) to integrate in HashMap

        for(String name : money.keySet()) {
            double cash = money.get(name);
            System.out.println(name + " : " + cash);}

        //Method (EntrySet) to integrate in HashMap

        double cash = money.get("Silvana");
        System.out.println("Silvana has : " +cash);


        }

}