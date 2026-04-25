import java.util.HashMap;

public class collectionhashmap {
    public static void main (String[] args) {


        HashMap<String, Integer> store = new HashMap<>();

        store.put("Apple",3);
        store.put("Bread",7);
        store.put("Milk", 5);

        Integer pao = store.get("Bread");
        System.out.println("The value of Bread is : " + pao);

        for (String stores : store.keySet()) {
            Integer value = store.get(stores);
            System.out.println(stores + " : " + value);
        }






//        HashMap<String, Integer> family = new HashMap<>();
//
//        family.put("Danilo", 27);
//        family.put("Silvana" , 40);
//        family.put("Vanessa" , 30);
//
//        //One of two method that we can get the key and the value
//
//        for (String familyName : family.keySet()) {
//            Integer ages = family.get(familyName);
//            System.out.println(familyName + " : " + ages);
//        }
//
//        //Getting just one ket and their value at time
//
//        Integer name = family.get("Silvana");
//        System.out.println("The name is : " + name);




    }
}