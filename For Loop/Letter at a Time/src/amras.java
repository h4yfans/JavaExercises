import java.util.Scanner;

/**
 * Created by KAAN on 15/05/2016.
 */
public class amras {
    public static void main(String[] args) {

        String str;
        int count = 0;
        Scanner input = new Scanner(System.in);

        str = input.nextLine();
        int a = str.length();

        System.out.println(a);

        System.out.println("Your message is " + str.length() + " characters long.\n" +
                "The first character is a position 0 and is " + "'" + str.charAt(0) + "'.\n" +
                "The last character is at position " + str.length() + " and is " + "'" + str.charAt(str.length() - 1) + "'");

        char[] charArray = str.toCharArray();

        System.out.println(charArray);

        for (char b : charArray) {
            System.out.println(count + " > " + b);
            count++;
        }


    }
}
