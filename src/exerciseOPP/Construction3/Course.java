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

    public Course(String courseName, String studentName, double totalHours, int price) {

        this.courseName = courseName;
        this.studentName = studentName;
        this.totalHours = totalHours;
        this.hoursCompleted = 0;
        this.price = price;
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

        for (int i = 1; i <= changeType; i++) {
            System.out.print("#");
            System.out.println("Progress" + (int) progress() + "%");
        }
    }

    public void certificate() {

        if (isCompleted()) {
            System.out.print("The course is already completed and the Certificate issued for " + studentName);
        }
        else {
            System.out.print(" Keep going! " + progress());
        }

    }
}
