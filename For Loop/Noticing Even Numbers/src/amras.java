import java.util.Scanner;

/**
 * Created by KAAN on 15/05/2016.
 */
public class amras {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();

        for(int i = 1; i < a ; i++){
                if (i%2==0)
                    System.out.println(i + "<");
                else
                    System.out.println(i);
        }

    }
}
