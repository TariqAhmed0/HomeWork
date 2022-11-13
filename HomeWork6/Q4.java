import java.util.Scanner;

public class Q4 {
    public static void main ( String[] args ) {
        Scanner in =new Scanner ( System.in );
        System.out.println ("Enter the Word tyb string");
        String word =in.next ();
        int cont=word.length ()-1;
        while ( cont >=0) {System.out.print (  word.charAt ( cont ));cont--;}

     }
}
