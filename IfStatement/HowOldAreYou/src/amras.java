import java.util.Scanner;

/**
 * Created by KAAN on 14/05/2016.
 */
public class amras {
    public static void main(String[] args) {

        int age;
        String name;

        Scanner input = new Scanner(System.in);
        age = input.nextInt();

        System.out.println("What is your name?");
        name = input.nextLine();

        if (age < 16)
            System.out.println("You can't drive " +name);
        if (age < 18)
            System.out.println("You can't vote " +name);
        if (age < 25)
            System.out.println("You can't rent a car " +name);
        if (age >= 25)
            System.out.println("You can do anything that's legal " +name);


    }
}
