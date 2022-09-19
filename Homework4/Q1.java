import java.awt.Rectangle;
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {

        Rectangle N = new Rectangle();
        Scanner input = new Scanner (System.in);

        System.out.print("Please enter the Width : ");
        N.width = input.nextInt();

        System.out.print("Please Enter the Height : ");
        N.height = input.nextInt();

        System.out.println("the perimeter is : " + 2*(N.getWidth() + N.getHeight()));
    }
}