import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A;

        System.out.println("Enter the number: ");
        A = input.nextInt();

        if (A > 0)
            System.out.println("The number is positive ");
        else if (A == 0)
            System.out.println("The number is equal to zero ");
        else
            System.out.println("The number is negative");
    }
}
