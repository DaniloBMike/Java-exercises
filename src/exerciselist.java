import java.util.ArrayList;
import java.util.List;

public class exerciselist {
    public static void main (String[] args) {

//        List<String> students = new ArrayList<>();
//
//        students.add("Ana");
//        students.add("Bruno");
//        students.add("Carlos");
//        students.add("Diana");
//
//        students.add(2, "Eduardo");
//
//        students.remove(1);
//
//        int studant = students.size();
//        System.out.println(" The size is : " + studant);
//
//        String nameStudent = students.get(2);
//        System.out.println(" The third student is : " + nameStudent);
//
//        for (String allStudents : students) {
//            System.out.println(allStudents);
//        }
//
//        boolean empty = students.isEmpty();
//        System.out.println("The list is empty ? " + empty);
//
//        boolean contein = students.contains("Diana");
//        System.out.println("There are Diana in the list ? " + contein);
//
//        students.forEach(school -> System.out.println(school));
//    }

        List<String> fruits = new ArrayList<>();

        fruits.add("Mango");
        fruits.add("Grape");
        fruits.add("Banana");
        fruits.add("Orange");
        System.out.println(fruits);

        fruits.remove(1);

        fruits.size();
        System.out.println(fruits);

        fruits.get(2);
        System.out.println(fruits);
    }

}