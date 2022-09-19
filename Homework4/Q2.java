public class Q2 {
    public static void main(String[] args) {

        String T = "Mississippi";

        System.out.println
                ("The T : " + T + "\nNow i will replace each letter \"i\" with the letter \"ii\"");

        T = T.replace("i", "ii");

        System.out.println("The T after modification is : " + T + "\nNow i will replace each letter \"ss\" with the letter \"s\"");

        T = T.replaceAll("ss", "s");

        System.out.println("The T after modification is : " + T);
    }
}
