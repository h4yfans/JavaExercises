import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Scanner;

/**
 * Created by KAAN on 15/05/2016.
 */
public class amras {
    public static void main(String[] args){

        int keyboard;
        int pass;

        Scanner input = new Scanner(System.in);
        pass = 12345;

        keyboard = input.nextInt();

        while(pass!=keyboard){
            System.out.println("Incorrect pin. Try Again!\n Enter your pin.");
            keyboard = input.nextInt();
        }

        System.out.println("Correct pin.");


    }
}
