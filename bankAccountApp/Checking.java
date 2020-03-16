package bankAccountApp;

public class Checking extends Account {
    private int debitCardNumber;
    private int debitCardPIN = (int)(Math.random()*Math.pow(10,4));

    public Checking(String name,String sSN,double initDeposit){
        super(name, sSN, initDeposit);

        System.out.println("Name is"+ name);
        accountNumber="2"+accountNumber;
        setDebitCard();

    }
    private void setDebitCard(){
        debitCardNumber= (int) (Math.random()*Math.pow(10,12));
        debitCardPIN=(int)(Math.random()*Math.pow(10,4));

    }
    public void showInfo(){
        super.showInfo();
        System.out.println("Account Features"+"\n Debit card number"+debitCardNumber+"\ndebit card PIN"+debitCardPIN);
    }
    @Override
    public void setRate(){
        rate=getBaseRate()*0.15;
    }
}
