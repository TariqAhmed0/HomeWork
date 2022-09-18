import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("-----------------------------------------------|");
        System.out.println("Enter The Perimeter End Area Of The Rectangle ");
        System.out.println("------------------------------------------------|");
        int Length,Width;
        int  Area,Perimeter;
        System.out.println("Enter length=\n");
        Length=in.nextInt();
        System.out.println("Enter Width=\n");
        Width=in.nextInt();
        Area=Length*Width;
        Perimeter=2*(Length*Width);
        System.out.println("rectangle Area=\n"+Area);
        System.out.println("Perimeter Area=\n"+Perimeter);




    }
}
