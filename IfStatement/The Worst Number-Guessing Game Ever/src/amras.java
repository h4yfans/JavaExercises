import java.util.Scanner;

/**
 * Created by KAAN on 15/05/2016.
 */
public class amras {
    public static void main(String[] args){

        int number = 8;
        int guess;

        Scanner input = new Scanner(System.in);

        System.out.println("Guess number between 0-10");
        guess = input.nextInt();

        if (guess == number){
            System.out.println("LOL. YOU GOT IT!!");
        }else{
            System.out.println("LOSER. IT WAS 8");
        }




    }
}
