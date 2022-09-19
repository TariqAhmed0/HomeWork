@SuppressWarnings("ALL")
public class Q3 {
    public static void main(String[] args) {
        String A = "Mississippi";
        System.out.println("ReplaceTester program...\nthe text is : " + A + "Now i will encrypt it...");

        System.out.println("The old text is : " + A);

        A=A.replace("i", "!");

        System.out.println("The new text is : " + A);
    }
}
