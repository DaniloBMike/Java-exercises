package exerciseOPP.Constructor3;

public class Students {
    public static void main(String[] args) {

        //Student01

        Course student01 = new Course("Software Engineer", "Danilo", 650.0, 3000);

        student01.studyHours(650.0);
        student01.showProgressBar();
        student01.certificate();

        //Student02

        Course student02 = new Course("Machine Learning","Victor ",550.0,2500);

        student02.studyHours(500.0);
        student02.showProgressBar();
        student02.certificate();

       //Student03

       Course student03 = new Course("Data Analysis","Sidney ",500.0,3750);

       student03.studyHours(380.0);
       student03.showProgressBar();
       student03.certificate();
    }
}
