import java.util.Scanner;

/**
 * Created by KAAN on 15/05/2016.
 */
public class amras {
    public static void main(String[] args){

        int count=0;
        int times;
        String s="";
        Scanner input = new Scanner(System.in);

        System.out.print("Type in a message, and I'll display it five times.\nMessage: ");
        s = input.nextLine();

        System.out.print("How many times?");
        times =  input.nextInt();


        while(times>count){

            System.out.println(s);
            count++;
        }

    }
}
