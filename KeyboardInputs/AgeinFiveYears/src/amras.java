import java.util.Scanner;

/**
 * Created by KAAN on 14/05/2016.
 */
public class amras {
    public static void main(String[] args){

        int age, fiveago,fivelater;
        String name;

        Scanner input = new Scanner(System.in);

        System.out.println("Hello. What is your name?");
        name = input.nextLine();

        System.out.println("Hi, " + name + " !How old are you?");
        age = input.nextInt();

        fiveago = age -5;
        fivelater = age + 5;

        
        System.out.println("Did you know that in five years you will be " + fivelater + " years old? \nAnd five years ago you were " +fiveago  + "! Imagine that!");


    }
}
