import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        int x,y;
        Scanner in=new Scanner(System.in);
        System.out.println("Please Enter tow Number...");
        System.out.println("Number One= ");
        x=in.nextInt();
        System.out.println("Number Two=");
        y=in.nextInt();
        //The Sum
        System.out.println("The Sum="+(x+y));
        //The Difference
        System.out.println("The Difference="+(x-y));
        //The Product
        System.out.println("The Product="+(x*y));
        //The Average
        System.out.println("The average="+((float) x-y/2));
        //The Distance(Absolute Value Of The Difference)
        System.out.println("The Distance="+(Math.abs(x-y)));
        //the larger
        if(x>y)
            System.out.println("The Max="+x);
        else
        System.out.println("The Max="+y);
        if(x<y)
            System.out.println("the Min="+x);
        else
            System.out.println("The Min "+y);


    }
}
