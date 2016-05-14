import java.util.Scanner;

/**
 * Created by KAAN on 14/05/2016.
 */
public class amras {
    public static void main(String[] args) {

        String fname, lname, login;
        int grade, studentid;
        double gpa;

        Scanner input = new Scanner(System.in);

        System.out.printf("First name: ");
        fname = input.nextLine();

        System.out.printf("Last name: ");
        lname = input.nextLine();

        System.out.printf("Grade (9-12): ");
        grade = input.nextInt();

        System.out.printf("Student ID: ");
        studentid = input.nextInt();

        System.out.printf("Login: ");
        login = input.nextLine();

        System.out.println("GPA (0.0 -  4.0)");
        gpa = input.nextDouble();

        System.out.println("Your information : \n" +
                "First name: " + fname + "\n" +
                "Last name: " + lname + "\n" +
                "Grade(9-12): " + grade + "\n" +
                "Student ID: " + studentid + "\n" +
                "Login: " + login  + "\n" +
                "GPA (0.0-4.0): " + gpa);
    }
}
