import java.util.Scanner;

/**
 * Created by KAAN on 14/05/2016.
 */
public class amras {
    public static void main(String[] args) {

        double weight;
        int choice;
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your current earth weight");
        weight = input.nextDouble();

        System.out.println("I have information for the following planets:\n     1. Venus       2. Mars       3. Jupiter\n     4. Saturn      5. Uranus     6. Neptune");

        System.out.println("Which planet are you visiting");
        choice = input.nextInt();

        if (choice == 1)
            System.out.println(weight * 0.78);
        if (choice == 2)
            System.out.println(weight * 0.39);
        if (choice == 3)
            System.out.println(weight * 2.65);
        if (choice == 4)
            System.out.println(weight * 1.17);
        if (choice == 5)
            System.out.println(weight * 1.05);
        if (choice == 6)
            System.out.println(weight * 1.23);

    }
}
