package User;

public class Student extends User {
    String matric_no = "BHU/22/04/09/0051";
    String admission_no = "17181920";
    String registerCourse() {
        if (matric_no.equals("") || admission_no.equals("")) {
            return "You cannot register at this moment, Insufficent Payments";
        } else {
            return "You have registered for all courses";
        }
    }
    String checkResults() {
        if (matric_no.equals("") || admission_no.equals("")) {
            return "Cannot check your result.";
        } else {
            return "You got 5A's 4B's and 6C's";
        }
    }
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Robert Daniel";
        student.password = "Darol123$";
        System.out.println(student.register());
        System.out.println(student.registerCourse());
        System.out.println(student.checkResults());
    }
}