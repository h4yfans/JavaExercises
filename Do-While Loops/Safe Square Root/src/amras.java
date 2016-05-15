import java.util.Scanner;

/**
 * Created by KAAN on 15/05/2016.
 */
public class amras {
    public static void main(String[] args) {

        int number;
        Scanner input = new Scanner(System.in);

        do {

            number = input.nextInt();
            if (number>0)
                System.out.println("The square root of " + number + " is " + (Math.sqrt(number)));

        } while (number > 0);

        System.out.println("You can't type negative number?!?");

    }
}
