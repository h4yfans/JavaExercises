import java.util.Scanner;

/**
 * Created by KAAN on 14/05/2016.
 */
public class amras {
    public static void main(String[] args) {

        String answer;
        String size;
        String s = "I would ask you if I'm right, but I don't actually care.";

        Scanner input = new Scanner(System.in);

        System.out.println("It is animal, vegatable or mineral?");
        answer = input.nextLine();

        System.out.println("Is is bigger than a breadbox?");
        size = input.nextLine();


        if (answer.equals("animal"))
            if (size.equals("no"))
                System.out.println("My guess is that you are thinking of a squirrel.\n"+s);
            else if (size.equals("yes"))
                System.out.println("My guess is that you are thinking of a moose.\n"+s);

        if (answer.equals("vegetable"))
            if (size.equals("no"))
                System.out.println("My guess is that you are thinking of a carrot.\n"+s);
            else if (size.equals("yes"))
                System.out.println("My guess is that you are thinking of a watermelon.\n"+s);

        if (answer.equals("mineral"))
            if (size.equals("no"))
                System.out.println("My guess is that you are thinking of a paper clip\n.\n"+s);
            else if (size.equals("yes"))
                System.out.println("My guess is that you are thinking of a Camaro.\n"+s);





    }
}
