import java.util.Scanner;

/**
 * Created by KAAN on 14/05/2016.
 */
public class amras {
    public static void main(String[] args){

        String answer,alive;

        Scanner input = new Scanner(System.in);

        System.out.println("Think of some thing inside or outside or both?");
        answer = input.nextLine();

        System.out.println("Is it living thing?");
        alive = input.nextLine();

        if (answer.equals("inside"))
            if (alive.equals("alive"))
                System.out.println("Then what else could you be thinking of besides a houseplant");
            else if(alive.equals("not alive"))
                System.out.println("Then what else could you be thinking of besides a shower curtain");

        if (answer.equals("outside"))
            if (alive.equals("alive"))
                System.out.println("Then what else could you be thinking of besides a bison");
            else if(alive.equals("not alive"))
                System.out.println("Then what else could you be thinking of besides a shower billboard");

        if (answer.equals("both"))
            if (alive.equals("alive"))
                System.out.println("Then what else could you be thinking of besides a dog");
            else if(alive.equals("not alive"))
                System.out.println("Then what else could you be thinking of besides a shower cell phone\n");

    }
}
