import java.util.Random;
import java.util.Scanner;

/**
 * Created by KAAN on 15/05/2016.
 */
public class amras {
    public static void main(String[] args) {

        boolean tof;
        String yn = "";
        String flip ="";
        Scanner input = new Scanner(System.in);
        Random r = new Random();

        do{
            tof = r.nextBoolean();
            if (tof == true)
                flip="TAILS";
            else
                flip="HEADS";

            System.out.println("You flip a coint and it is .." +flip);
            System.out.print("Would you like to flip again (y/n)? > ");
            yn = input.nextLine();

        }while(yn.equals("y"));

    }

}
