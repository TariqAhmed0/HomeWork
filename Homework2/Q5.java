import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Variables And Their Numbers=\n");
        int x,y,z;
        x=in.nextInt();
        y=in.nextInt();
        System.out.println("x="+x);
        System.out.println("y="+y);
        System.out.println("Switch The Two Numbers=");
        z=y;
        y=x;
        x=z;
        System.out.println("x="+x);
        System.out.println("y="+y);

    }
}
