/**
 * Created by KAAN on 15/05/2016.
 */
public class amras {
    public static void main(String[] args){

        System.out.println("Please type x1,y1,x2,y2");
        System.out.println(distance(-2,1,1,5));

    }


    public static double distance(double x1, double y1, double x2, double y2){
        return Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));

    }
}
