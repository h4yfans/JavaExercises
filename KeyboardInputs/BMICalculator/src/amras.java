import java.util.Scanner;

/**
 * Created by KAAN on 14/05/2016.
 */
public class amras {
    public static void main(String[] args) {

        double height, weight, result;

        Scanner input = new Scanner(System.in);

        System.out.printf("Your height in m:  ");
        height = input.nextDouble();

        System.out.printf("Your weight in kg: ");
        weight = input.nextDouble();

        result = weight /  (height * height) ;

        System.out.println("Your BMI is: " + result);


    }
}
