import java.util.Random;

/**
 * Created by KAAN on 15/05/2016.
 */
public class amras {
    public static void main(String[] args){

        int r1, r2;

        Random r= new Random();

        r1  = r.nextInt(5)+1;
        r2 = r.nextInt(5)+1;

        while(r1!=r2){
            System.out.println("Roll #1 :" + r1 + "\nRoll #2 :" + r2 + "\nThe total is " + (r1+r2));
            r1  = r.nextInt(5)+1;
            r2 = r.nextInt(5)+1;
        }

        System.out.println("Roll #1 :" + r1 + "\nRoll #2 :" + r2 + "\nThe total is " + (r1+r2));



    }
}
