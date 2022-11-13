import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String n=in.next();
        char[] sarray=n.toCharArray();
        StringBuilder builder=new StringBuilder();
        for (int i=n.length()-1;i<=0;i++){
            builder.append(sarray[i]);

        }
String s1=builder.toString();
        System.out.println(s1);
    }
}
