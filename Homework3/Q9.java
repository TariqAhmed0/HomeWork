import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        byte mounth,day;
        String season;
        System.out.println("please enter the number of mounth");
        mounth=in.nextByte();
        System.out.println("please enter the day from mounth");
        day=in.nextByte();
        if(mounth==1 ||mounth==2 ||mounth==3)
            season="Wither";
        else if(mounth==4 ||mounth==5 ||mounth==6)
            season="spring";
        else if(mounth==7 ||mounth==8 ||mounth==9)
            season="summer";
        else
            season="fall";
        if(day>=21 &&mounth==3)
            season= "spring";
        if(day>=21 &&mounth==6)
            season= "summer";
        if(day>=21 &&mounth==9)
            season= "fall";
        if(day>=21 &&mounth==12)
            season= "wither";

        System.out.println(season);
    }

}
