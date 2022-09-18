import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the area and perimeter of the circle");
        double r,pi;
        pi=3.14;
        double area,perimeter;
        r=in.nextDouble();
        area=pi*(r*r);
        perimeter=2*pi*r;
        System.out.println("the Circle of area=\n"+area);
        System.out.println("the perimeter of area=\n"+perimeter);
    }

}
