import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Three Number");
        int a,b,c;
        int Avg,Sum;
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        Sum=a+b+c;
        System.out.println("Enter The Sum Of Three Numbers=\n"+Sum);
        System.out.println("Enter The Average Of The Sum Of Three Number=\n"+Sum/3);
    }
}
