
import java.util.Random;
import java.util.Scanner;

/**
 * Created by KAAN on 15/05/2016.
 */
public class amras {

    public static void main(String[] args){

        int guess;
        int rand;
        Scanner input = new Scanner(System.in);
        Random r = new Random();

        guess = input.nextInt();
        rand = r.nextInt(100) +1;

        if (guess<rand)
            System.out.println("Sorry, you are too low. I was thinking of " + rand);
        else if(guess > rand)
            System.out.println("Sorry, you are too high. I was thinking of " + rand);



    }



}
