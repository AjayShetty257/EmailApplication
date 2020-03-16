package bankAccountApp;

public class Savings extends Account {
    private int safetyDepositBoxID;
    private int safetyDepositBoxKey;

    public Savings(String name,String sSN,double initDeposit){
        super(name, sSN, initDeposit);

        System.out.println("New Savings Account");
        accountNumber="1"+accountNumber;
        System.out.println("Account number"+this.accountNumber);
        setSafetyDepositBox();
    }
    private void setSafetyDepositBox(){
        safetyDepositBoxID=(int)  (Math.random()*Math.pow(10,3));
        System.out.println("Safety Deposit Box ID"+safetyDepositBoxID);
        safetyDepositBoxKey=(int)  (Math.random()*Math.pow(10,4));
    }
    public void showInfo(){
        super.showInfo();
        System.out.println("Account type savings");
        System.out.println("your savings account features"+"\nsafety deposit box id"+safetyDepositBoxID+"\nsafety deposit box key"+safetyDepositBoxKey);
    }
    @Override
    public void setRate(){
        rate=getBaseRate()-0.25;
    }
}
