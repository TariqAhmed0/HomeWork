import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float number[]= new float[3];
        String A;
        System.out.println("Enter three numbers please");
        for(int i=1;i<=3;i++){
            System.out.print("The number "+i+" = ");
            number[i-1]=input.nextFloat();
        }

                A=(number[0]==number[1]&&number[0]==number[2])? "جميع الارقام متساوية" :(number[0]!=number[1]&&number[0]!=number[2])? "الارقام  " : "مختلفة";
        System.out.println(A);
    }

}
