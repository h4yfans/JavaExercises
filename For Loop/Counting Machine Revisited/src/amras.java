import java.util.Scanner;

/**
 * Created by KAAN on 15/05/2016.
 */
public class amras {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Count from: ");
        int from= input.nextInt();
        System.out.print("Count to: ");
        int to = input.nextInt();
        System.out.print("Count by: ");
        int by = input.nextInt();

        for(int i = from; i <= to  ; i=i+by){
            System.out.println(i);
        }


    }
}
