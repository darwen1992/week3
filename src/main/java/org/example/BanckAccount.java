package org.example;

/**
 * Hello world!
 *
 */
public class BanckAccount
{
    private int accountnumber;
    private int balance;
    private String costumernumber;
    private String email;
    private int phonenumber;


    public BanckAccount(int accountnumber,int balance,String costumernumber,String email,int phonenumber) {
        this.accountnumber = accountnumber;
        this.balance=balance;
        this.costumernumber=costumernumber;
        this.email=email;
        this.phonenumber=phonenumber;
    }

    public int getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCostumernumber() {
        return costumernumber;
    }

    public void setCostumernumber(String costumernumber) {
        this.costumernumber = costumernumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(int accountnumber) {
        this.accountnumber = accountnumber;
    }

    public static void main(String[] args )
    {
        BanckAccount obj=new BanckAccount(1,250,"Darwen","gmail.com",48);
        obj.withdraw(100);
        obj.deposit(100);
    }

    void withdraw(int x){
        setBalance(getBalance()-x);
        System.out.println(getBalance());
    }
    void deposit(int x){
        setBalance(getBalance()+x);
        System.out.println(getBalance());
    }
}
