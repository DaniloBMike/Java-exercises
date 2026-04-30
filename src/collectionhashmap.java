import java.util.HashMap;

public class collectionhashmap {
    public static void main (String[] args) {


//        HashMap<String, Integer> store = new HashMap<>();
//
//        store.put("Apple",3);
//        store.put("Bread",7);
//        store.put("Milk", 5);
//
//        Integer pao = store.get("Bread");
//        System.out.println("The value of Bread is : " + pao);
//
//        for (String stores : store.keySet()) {
//            Integer value = store.get(stores);
//            System.out.println(stores + " : " + value);
//        }
//
//        for (Map.Entry<String,Integer> ages : store.entrySet()) {
//            String name = ages.getKey();
//            Integer ageFamily = ages.getValue();
//            System.out.println(name + " : " + ageFamily);
//        }






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


        HashMap<String, Integer> scores = new HashMap<>();

        scores.put("Diana", 150);
        scores.put("Alice", 200);
        scores.put("Carlos", 180);
        scores.put("Bruno", 220);

        Integer dianasScore = scores.get("Diana");
        System.out.println(" The Diana score is : " + dianasScore);

        for (String allNames : scores.keySet()) {
            Integer allscores = scores.get(allNames);
            System.out.println(allNames + " : " + allscores);
        }



    }
}