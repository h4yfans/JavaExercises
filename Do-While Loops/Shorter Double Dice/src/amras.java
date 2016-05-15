import java.util.Random;

/**
 * Created by KAAN on 15/05/2016.
 */
public class amras {
    public static void main(String[] args) {

        int r1, r2;
        Random r = new Random();

        do {
            r1 = r.nextInt(10) + 1;
            r2 = r.nextInt(10) + 1;

            System.out.println("Roll #1: " + r1);
            System.out.println("Roll #2: " + r2);
            System.out.println("The total is : " + (r1+r2));

        } while (r1 != r2);

    }
}
