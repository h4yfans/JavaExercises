import java.util.Scanner;

import static java.lang.System.out;

/**
 * Created by KAAN on 15/05/2016.
 */
public class amras {
    public static void main(String[] args){

        Scanner wpis = new Scanner(System.in);
        out.print("What is your last name? ");
        String name = wpis.next();

        if(name.compareTo("Carswell")<0)
            out.println("you don't have to wait long");
        else if (name.compareTo("Jones")<0)
            out.println("that's not bad");
        else if (name.compareTo("Smith")<0)
            out.println("looks like a bit of a wait");
        else if (name.compareTo("Young")<0)
            out.println("it's gonna be a while");
        else if (name.compareTo("Young")>0)
            out.println("not going anywhere for a while?");
        else
            out.println("error");

    }
}
