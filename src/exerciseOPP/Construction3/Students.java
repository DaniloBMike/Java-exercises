package exerciseOPP.Construction3;

public class Students {
    public static void main(String[] args) {

        Course student01 = new Course("Software Engineer", "Danilo", 600,0,3000,false);

        student01.studyHours(350);
        student01.showProgressBar();
    }
}
