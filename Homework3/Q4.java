import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        int A = 0, B = 10, C = 999999999, Number;
        System.out.print("Enter the number :");

        Number = input.nextInt();
        Number = (Number < 0) ? Number*-1 : Number;

        for (int i=0; i<9; i++) {
            A = (Number > C) ? B : --B ;
            C*=0.1;
        }

        System.out.println("The digits of number is : " + A);
    }
}
