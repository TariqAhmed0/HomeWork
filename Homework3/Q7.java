import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float in[]= new float[3];
        System.out.println("Enter three numbers please");
        for(int i=1;i<=3;i++){
            System.out.print("The number "+i+" = ");
            in[i-1]=input.nextFloat();
        }

        if(in[0]<in[1]&&in[1]<in[2])
            System.out.println("in order "+in[0]+" "+in[1]+" "+in[2]+"\n"+in[0]+" "+in[1]+" "+in[2]);
        else if(in[0]>in[2]&&in[2]>in[1])
            System.out.println("in order "+in[0]+" "+in[2]+" "+in[1]+"\n"+in[0]+" "+in[1]+" "+in[2]);
        else if (in[1]>in[0]&&in[0]>in[2])
            System.out.println("Neither "+in[1]+" "+in[0]+" "+in[2]+"\n"+in[0]+" "+in[1]+" "+in[2]);
        else if (in[1]>in[2]&&in[2]>in[0])
            System.out.println("Neither "+in[1]+" "+in[2]+" "+in[0]+"\n"+in[0]+" "+in[1]+" "+in[2]);
        else if (in[2]>in[0]&&in[0]>in[1])
            System.out.println("Neither "+in[2]+" "+in[0]+" "+in[1]+"\n"+in[0]+" "+in[1]+" "+in[2]);
        else if (in[2]>in[1]&&in[1]>in[0])
            System.out.println("Neither "+in[2]+" "+in[1]+" "+in[0]+"\n"+in[0]+" "+in[1]+" "+in[2]);
        else
            System.out.println("no"+"\n"+in[0]+" "+in[1]+" "+in[2]);
    }

}