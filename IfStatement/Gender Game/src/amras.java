import java.util.Scanner;

/**
 * Created by KAAN on 14/05/2016.
 */
public class amras {
    public static void main(String[] args){

        String genre, fname,lname,married;
        int age;

        Scanner input = new Scanner(System.in);

        System.out.println("What is your gender (M or F)");
        genre = input.nextLine();
        System.out.print("First name: ");
        fname = input.nextLine();
        System.out.print("Last name: ");
        lname = input.nextLine();
        System.out.print("Age ");
        age = input.nextInt();

        genre = genre.toUpperCase();

        if (genre.equals("M") && age >=20)
            System.out.println("Then I shall call you Mr. " + lname + ".");
        else if (genre.equals("M") && age <20 )
            System.out.println("Then I shall call you " + fname + ".");

        if (genre.equals("F")&& age>=20)
            System.out.println("Are you married " + fname
                    + "? (\"y\" or \"n\"?)");
            married = input.next();

        if ((genre.equals("f") && (age >= 20) && (married.equals("y"))))
            System.out.println("Then I shall call you Mrs. " + lname + ".");
        else if ((genre.equals("f") && (age >= 20) && (married.equals("n"))))
            System.out.println("Then I shall call you Ms. " + lname + ".");
        else if ((genre.equals("f") && (age <=20)))
            System.out.println("Then I shall call you Ms. " + lname + ".");


    }
}
