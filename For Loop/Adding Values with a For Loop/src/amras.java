import java.util.Scanner;

/**
 * Created by KAAN on 15/05/2016.
 */
public class amras {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Number > ");
        int a = input.nextInt();
        int sum = 0;

        for (int i = 0; i <= a; i++) {
            System.out.print(i + " ");
            sum += i;

        }
        System.out.println();
        System.out.println(sum);
    }
}
