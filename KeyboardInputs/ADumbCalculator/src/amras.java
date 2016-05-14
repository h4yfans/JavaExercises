import java.util.Scanner;

/**
 * Created by KAAN on 14/05/2016.
 */
public class amras {
    public static void main(String[] args){

        double n1,n2,n3,answer;

        Scanner input = new Scanner(System.in);

        System.out.println("What is first number? ");
        n1 = input.nextDouble();

        System.out.println("What is second number? ");
        n2 = input.nextDouble();

        System.out.println("What is third number? ");
        n3 = input.nextDouble();

        answer = (n1+n2+n3)/2;


        System.out.println("( " + n1 + n2 + n3  + ") / 2 is " + answer );


    }
}
