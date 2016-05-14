import java.util.Scanner;

/**
 * Created by KAAN on 14/05/2016.
 */
public class amras {
    public static void main(String[] args){

        String name;
        int age;
        int salary;

        Scanner input = new Scanner(System.in);

        System.out.println("Whatssup! What is your name?");
        name = input.nextLine();

        System.out.printf("Hi %s! How old are you?",name);
        age = input.nextInt();

        System.out.println("So you're " + age + " eh? That's not old at all! \n How much do you make "+ name+ "?");
        salary = input.nextInt();


        System.out.printf("%s ! I hope that's per hour and not per year! LOL!!" , salary);

    }
}
