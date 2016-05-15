import java.util.Scanner;

/**
 * Created by KAAN on 15/05/2016.
 */
public class amras {
    public static void main(String[] args){

        int number = 4;
        int guess;

        Scanner input = new Scanner(System.in);


        System.out.print("Your guess? > ");
        guess = input.nextInt();

        while(number!=guess){
            System.out.print("Incorrect number. Try again > ");
            guess = input.nextInt();
        }

        System.out.println("That's right.");

    }
}
