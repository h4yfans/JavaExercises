import java.util.Random;
import java.util.Scanner;

/**
 * Created by KAAN on 15/05/2016.
 */
public class amras {
    public static void main(String[] args){

        int guess,random;

        Scanner input = new Scanner(System.in);
        Random r = new Random();


        do{
            random = r.nextInt(10)+1;
            System.out.print("I have chosen a number between 1 and 10.  Try to guess it.\nYour guess > ");
            guess = input.nextInt();


        }while (random!=guess);

        System.out.println("You found the number. Nice guess!!");

    }
}
