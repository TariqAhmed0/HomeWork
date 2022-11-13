import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter number ");
        int num = in.nextInt();
        for (;;){
            if (num==0)break;
            int d =(num%2==1)?1:0;
            num/=2;
            System.out.println(d);
        }
    }
}
