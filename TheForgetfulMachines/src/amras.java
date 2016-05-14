import java.util.Scanner;

/**
 * Created by KAAN on 14/05/2016.
 */
public class amras {
    public static void main(String[] args) {

        int n1, n2;
        String w1, w2;
        Scanner input = new Scanner(System.in);

        System.out.println("Give me a word!");
        w1 = input.nextLine();

        System.out.println("Give me a second word!");
        w2 = input.nextLine();

        System.out.println("Great, now your favorite number?");
        n1 = input.nextInt();

        System.out.println("And your second-favorite number...");
        n2 = input.nextInt();

        System.out.println("Whew! Wasn't that fun?");

    }
}
