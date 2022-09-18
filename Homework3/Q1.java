public class Q1 {
    public static void main(String[] args) {
        int n=1;
        int m=-1;
        //a.
        if(n<-m)
        {System.out.println(n);}
        else
        {System.out.println(m);}
        //b.
        if(-n>=m)
        {System.out.println(n);}
        else
        {System.out.println(m);}
        //c.
        double x=0;
        double y=1;
        if(Math.abs(x-y)<1)
        {System.out.println(x);}
        else
        {System.out.println(y);}
        //d.
        x=Math.sqrt(2);
        y=2;
        if(x*x==y)
        {System.out.println(x);}
        else
        {System.out.println(y);}
    }
}
