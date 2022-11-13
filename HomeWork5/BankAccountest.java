public class BankAccountest {
    public static void main(String[] args) {
   
        Account c1=new Account();
   
        c1.insert(2000,"tariq",1100);
        
        c1.Bonus(10);
        System.out.println(c1.toString());
    }
}
