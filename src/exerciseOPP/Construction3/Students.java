package exerciseOPP.Construction3;

public class Students {
    public static void main(String[] args) {

        //Student01

        Course student01 = new Course("Software Engineer", "Danilo", 650.0,0,3000,false);

        student01.studyHours(450.0);
        student01.showProgressBar();
        student01.certificate();
    }
}
