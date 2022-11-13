import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year =0;
        double rate , inves;
        System.out.println(" enter the inves ");
        inves = in.nextInt();
        System.out.println("enter rate");
        rate = in .nextInt();
        rate *=0.01;
        for (;;){
           
            inves+=inves*rate;

            if (inves>=1000000)break;
            else year++;
        }
        System.out.println("yor inves "+inves);
        System.out.println(" year = "+ year);

    }
}
