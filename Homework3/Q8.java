import java.util.Scanner;
import javax.swing.JOptionPane;

public class Q8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        System.out.print("please enter worker`s name \n");
        name=input.nextLine();
        double sal,who ,hour$,hour;
        System.out.print("Enter the employee`s working hours\n");
        who=input.nextFloat();
        System.out.print("Enter the working rate per hour by $\n");
        hour$=input.nextFloat();
        hour=(who>40)? (who-40)*(hour$*1.5f): 0;
        who=(who*hour$);
        sal=who+hour;

        JOptionPane.showMessageDialog(null,"|-----------------------------------------------------------------|\n"
                +"| A sum of money is prid #" + sal +"$                           |\n"
                +"| to the worker *"+name+"* for his working hours\n"
                +"|-----------------------------------------------------------------|\n");
    }

}
