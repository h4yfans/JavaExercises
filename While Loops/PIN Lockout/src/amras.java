import java.util.Scanner;

/**
 * Created by KAAN on 15/05/2016.
 */
public class amras {
    public static void main(String[] args) {

        int pin = 12345;
        int key;
        int tried = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your pin > ");
        key = input.nextInt();

        while (pin != key && tried !=3) {
            System.out.print("Incorrect password\nEnter your pin > ");
            key = input.nextInt();
            tried++;
        }

        if (tried==3){
            System.out.println("You have run out of tries. Account locked");
        }

        if (key==pin){
            System.out.println("Access graded");
        }


    }
}
