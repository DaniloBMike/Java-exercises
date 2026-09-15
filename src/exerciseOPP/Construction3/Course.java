package exerciseOPP.Construction3;

public class Course {

    //Attributes

    String courseName;
    String studentName;
    double totalHours;
    double hoursCompleted;
    int price;
    boolean graduate;


    //Construction

    public Course(String courseName, String studentName, double totalHours, double hoursCompleted, int price, boolean graduate) {

        this.courseName = courseName;
        this.studentName = studentName;
        this.totalHours = totalHours;
        this.hoursCompleted = 0;
        this.price = price;
        this.graduate = graduate;
    }

    //Methods

    public void studyHours (double hours){

        hoursCompleted = hoursCompleted + hours;
    }

    public double progress(){

        return (hoursCompleted / totalHours) * 100;
    }

    public boolean isCompleted() {

        if(progress() >= 100) {
            return true;
        }
        else {
            return false;
        }
    }

    public void showProgressBar() {

        int changeType = (int) (progress() / 10);

        for (int i = 0; i <= changeType; i++) {
            System.out.println(changeType + "%");
        }
    }

    public void certificate() {

        if (isCompleted()) {
            System.out.println("The course is already completed and the Certificate issued for" + studentName);
        }
        else {
            System.out.println("Keep going" + c);
        }

    }
}
