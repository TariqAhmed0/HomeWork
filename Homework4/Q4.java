import java.awt.*;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Rectangle A = new Rectangle();

        System.out.println("Wilcome to Tester ");

        System.out.println("Enter Height: ");
        A.height = input.nextInt();

        System.out.println("Enter Width: ");
        A.width = input.nextInt();

        System.out.println("Enter X: ");
        A.x = input.nextInt();

        System.out.println("Enter Y: ");
        A.y = input.nextInt();

        A.add(2, 2);

        System.out.println("The height is ( "
                + A.height + " )\nThe width is ( " + A.width + " )\n"
                + "The X is ( " + A.x + " )\nThe Y is ( " + A.y + " )");
    }
}
