import java.util.HashMap;

public class collectionhashmap {
    public static void main (String[] args) {

        HashMap<String, Integer> family = new HashMap<>();

        family.put("Danilo", 27);
        family.put("Silvana" , 40);
        family.put("Vanessa" , 30);

        //One of two method that we can get the key and the value

        for (String familyName : family.keySet()) {
            Integer ages = family.get(familyName);
            System.out.println(familyName + " : " + ages);
        }

        //Getting just one ket and their value at time

        Integer name = family.get("Silvana");
        System.out.println("The name is : " + name);




    }
}