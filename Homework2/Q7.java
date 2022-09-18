import java.sql.SQLOutput;

public class Q7 {
    public static void main(String[] args) {
        StringBuilder Str=new StringBuilder("tariq");
        System.out.println("string:"+Str);
        System.out.println("Character The First Position:"+Str.charAt(0));
        System.out.println("Character The First Position:"+Str.charAt(7));
        Str.deleteCharAt(0);
        Str.deleteCharAt(6);
        System.out.println(Str);
    }
}
