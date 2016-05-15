import java.util.Random;
import java.util.Scanner;

/**
 * Created by KAAN on 15/05/2016.
 */
public class amras {
    public static void main(String[] args){

        int type;
        int random;
        Scanner input = new Scanner(System.in);
        Random r = new Random();

        random = r.nextInt(10) + 1;

        System.out.println("I'm thinking of a number from 1 to 10");
        type = input.nextInt();

        if (type == random)
            System.out.println("You found. Perfect!! ");
        else
            System.out.println("I'm sorry. Number was: " + random);


    }
}
