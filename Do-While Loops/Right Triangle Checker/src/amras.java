import java.util.Scanner;

/**
 * Created by KAAN on 15/05/2016.
 */
public class amras {
    public static void main(String[] args) {

        int n1, n2, n3;
        Scanner input = new Scanner(System.in);


        System.out.println("Enter 3 integers:");
        System.out.println("Number1:");
        n1 = input.nextInt();
        System.out.println("Number2:");
        n2 = input.nextInt();

        if ( n2 < n1 ) {
            do {
                System.out.println(n2 + " is smaller than " + n1);
                System.out.println("Try again");
                System.out.println("Number2:");
                n2 = input.nextInt();
            } while ( n2 < n1 );
        }

        System.out.println("Number 3");
        n3 = input.nextInt();

        if ( n3 < n2 ) {
            do {
                System.out.println(n3 + " is smaller than " + n2);
                System.out.println("Try again");
                System.out.println("Number3:");
                n3 = input.nextInt();
            } while ( n3 < n2 );
        }

        System.out.printf("Your three sides are %d %d %d", n1,n2,n3 );
    }
}
