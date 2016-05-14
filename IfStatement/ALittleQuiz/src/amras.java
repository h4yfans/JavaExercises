import java.util.Scanner;

/**
 * Created by KAAN on 14/05/2016.
 */
public class amras {
    public static void main(String[] args) {

        int count = 0;
        int answer;

        Scanner input = new Scanner(System.in);


        System.out.println("What is the capital of Alaska? \n      1) Melbourne\n      2) Anchorage\n      3) Juneau");
        answer = input.nextInt();
        if (answer == 3) {
            System.out.println("That's right");
            count++;
        } else {
            System.out.println("Wrong answer. Google it please :)");
        }


        System.out.println("Can you store the value 'cat' in a variable of type int?\n     1) yes\n     2) no");
        answer = input.nextInt();

        if (answer == 2) {
            System.out.println("Correct answer!");
            count++;
        } else {
            System.out.println("Wrong answer. Sorry :(");
        }

        System.out.println("What is the result of 9+6/3\n     1) 5\n     2) 11\n     3)15/3");
        answer = input.nextInt();

        if (answer == 2) {
            System.out.println("Correct!!");
            count++;
        } else {
            System.out.println("Wrong");
        }

        System.out.println("Overall, you got " + count + " out of 3 correct\nThanks for playing!");
    }
}
