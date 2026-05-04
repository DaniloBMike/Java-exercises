import java.util.TreeMap;

 public class exercisetreemap {
    void main() {

        TreeMap<String, Integer> scores = new TreeMap<>();

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
