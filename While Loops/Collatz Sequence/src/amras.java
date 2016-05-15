import java.util.Scanner;

/**
 * Created by KAAN on 15/05/2016.
 */
public class amras {
    public static void main(String[] args) {

        int n;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        System.out.print(n + " ");
        while (n != 1) {
            if (n % 2 == 0){
                n = n / 2;
                System.out.print(n + " ");}
            else{
                n = n * 3 + 1;
                System.out.print(n + " ");}
        }

    }
}
