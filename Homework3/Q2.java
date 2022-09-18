import java.util.Scanner;
@SuppressWarnings("LoopStatementThatDoesntLoop")
public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        char[] character = new char[] {'a','c','e','g','b','d','f','h'};


        System.out.println("Enter the letter and then the number to find the color of the square on the chessboard...");
        System.out.print("Enter the letter : ");
        char letter = input.next().charAt(0);
        System.out.print("Enter the number: ");
        byte number = input.nextByte();

        int i=0;
        while (true) {
            if (letter == character[i]){
                if (number%2 == 1) { System.out.println("Black");
                }
                else { System.out.println("White");
                }
            }
            else {
                if (number%2 == 1) { System.out.println("White");
                }
                else { System.out.println("Black");
                }
            }
            break;
        }

    }
}
