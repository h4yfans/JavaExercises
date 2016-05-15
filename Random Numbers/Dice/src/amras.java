import java.util.Random;

/**
 * Created by KAAN on 15/05/2016.
 */
public class amras {
    public static void main(String[] args){

        Random r = new Random();

        int a = r.nextInt(10) + 1;
        int b = r.nextInt(10) + 1;

        System.out.println("ROLL #1: " +a);
        System.out.println("ROLL #2: " +b);
        System.out.println("The total is : "+ (a+b));

    }
}
