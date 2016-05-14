import java.util.Scanner;

/**
 * Created by KAAN on 14/05/2016.
 *
 */


public class amras {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int age;
        int weight;
        int height;

        System.out.println("How old are you?");
        age = input.nextInt();

        System.out.println("How tall are you?");
        height= input.nextInt();

        System.out.println("How much do you weight?");
        weight = input.nextInt();

        System.out.printf("So you are %d old, %d height and %d weight heavey",age,height,weight  );

    }
}
