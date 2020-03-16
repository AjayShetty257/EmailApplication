package bankAccountApp;

public abstract class Account implements IBaseRate{
    private String name;
    private String sSN;
    protected String accountNumber;
    private double balance;
    protected double rate;
    static int index=10000;

    public Account(String name,String sSN,double initDeposit){
        this.name=name;
        this.sSN=sSN;
        balance=initDeposit;
        System.out.println("Name :"+name+"\nsSN :"+sSN+"\nbalance :"+balance);
        index++;
        this.accountNumber=setAccountNumber();
        setRate();

    }
    private String setAccountNumber(){
        String lastTwoOfsSN=sSN.substring(sSN.length()-2,sSN.length());
        int uniqueID=index;
        int randomNumber= (int) ((int)Math.random()*Math.pow(10,3));
        return lastTwoOfsSN+uniqueID+randomNumber;
    }
    public abstract void setRate();
    public void showInfo(){
        System.out.println("Name : "+name+"\nAccount number"+accountNumber+"\nbalance"+balance+"\nrate"+rate+"%");
    }
    public void deposit(double amount){
        balance=balance+amount;
    }
    public void withdraw(double amount){
        balance=balance-amount;
    }
    public void transfer(String towhere,double amount){
        balance=balance-amount;
        System.out.println("transferring"+balance+"to"+towhere);
    }
}
