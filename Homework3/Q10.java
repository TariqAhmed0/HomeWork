import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        byte month;
        System.out.println("please enter the  month`s number");
        month=in.nextByte();
        if(month>=1||month<=12){
            if(month==4||month==6||month==9||month==11)
                System.out.println("the days of month are 30 days");
            else if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
                System.out.println("the days of month are 31 days");
            else
                System.out.println("the days of month are 28 or 29 days");
        }
        else
            System.out.println("the number if month not true please try again");
    }

}
