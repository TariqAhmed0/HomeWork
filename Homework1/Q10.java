import javax.swing.*;
import java.sql.SQLOutput;

public class Q10 {
    public static void main(String[] args) {
        String name= JOptionPane.showInputDialog("what is your name");
        System.out.println(name);
        JOptionPane.showInputDialog("my name is Tariq.\n What do you want me to do??");
        System.out.println("Im sorry " + name + " I can not help you.");
    }
}
