package exerciseOPP.Construction3;

public class Students {
    public static void main(String[] args) {

        //Student01

        Course student01 = new Course("Software Engineer", "Danilo", 650.0,3000,false);

        student01.studyHours(450.0);
        student01.certificate();
        student01.showProgressBar();

        //Student02

        Course student02 = new  Course("TI", "Vito",650.0,2000,false);

        student01.studyHours(550.0);
        student01.certificate();
        student01.showProgressBar();

        //Student03

        Course student03 = new Course("Machine Learning","Sidney",650.0,4000,true);

        student01.studyHours(450.0);
        student01.certificate();
        student01.showProgressBar();
    }
}
