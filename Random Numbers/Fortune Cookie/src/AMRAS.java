import java.util.Random;

/**
 * Created by KAAN on 15/05/2016.
 */
public class AMRAS {
    public static void main(String[] args){

        Random r = new Random();


        int choice = 1 + r.nextInt(10);
        String response = "";

        if ( choice == 1 )
            response = "You will find happiness with a new love";
        else if ( choice == 4 )
            response = "Stick with your wife\n"+"13 - 44 - 19 - 37 - 29 - 17";
        else if ( choice == 5 )
            response = "Trust your friends in the future";
        else if ( choice == 9 )
            response = "Do the thing you love the most";
        else if ( choice == 2 )
            response = "Be kind to the lesser man";
        else if ( choice == 7 )
            response = "You will get harvest the riches of your hard work";
        else
            response = "Fortune cookies sucks";

        System.out.println("The fortune cookie says: " + response );

    }
}
