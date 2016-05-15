import java.util.Scanner;

/**
 * Created by KAAN on 15/05/2016.
 */
public class amras {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        double a = input.nextInt();

        for(double i = a; i <= a*(-1)  ; i+=0.5){
            System.out.println(i);
        }

    }
}
