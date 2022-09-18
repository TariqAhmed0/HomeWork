public class Q5 {
    public static void main(String[] args) {
        char name[]=new char[]{'m','o','h','a','m','m','e','d'};
        for(int i=0;i<=2;i++)
        {
            for(int j=0; j<=10;j++) {
                if (i==1&&j==1 || i==1&&j==2 || i == 1 && j == 3 || i == 1 && j == 4 || i == 1 && j == 5 || i == 1 && j == 6 || i == 1 && j == 7 || i == 1 && j == 8)
                    System.out.print(name[j-1]);
                else {
                    System.out.print("-");
                }
            }
            System.out.print("\n");

        }










    }
}
