import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        float in[]=new float [3];
        String number;
        System.out.println("Enter 3 incremental or decreasing numbers : ");

        for (int i=1; i<=3; i++)
        {
            System.out.println("the number "+i+"= ");
            in[i-1]= input.nextFloat();
        }
        number=(in[0]<in[1]&&in[1]<in[2])? "تزايدية++" : (in[0]>in[1]&&in[1]>in[2])? "تناقصية--" : "No";
        System.out.println(number);
    }
}
