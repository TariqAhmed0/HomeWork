public class Account {
    private int accountno;
    private  String name;
    private double amount;

    public void  insert(int accountno,String name,double amount){
        this.accountno=accountno;
        this.name=name;
        this.amount=amount;

    }

    public void deposit(double amt){
        this.amount=this.amount+amt;
        System.out.println(amt+"Depoited");
    }

    public void withdraw (double amt){
        if(amount<amt)
            System.out.println("Insufficient Balance");
        else
            this.amount=this.amount-amt;
        System.out.println(amt+"Withdrawn");

    }

    public void checkBalance(){
        System.out.println("Balance"+this.amount);
    }
    public void Bonus(double x){
        this.amount=this.amount+(amount*0.100);
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountno=" + accountno +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                '}';
    }

    public int getAccountno() {
        return accountno;
    }

    public void setAccountno(int accountno) {
        this.accountno = accountno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
