package myapp.core;

import java.sql.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;   
//import java.util.Random;

public class BankAccount {

    // members
    private String accountName;
    private String accountNumber;
    private float accountBalance;
    private List<String> transactions = new LinkedList<String>();
    private boolean ifClosed;
    private Date accountCreationDate;
    private Date accountClousureDate;

    // constructors
    public BankAccount() {
    }

    public BankAccount(String name) {
        this.accountName = name;
        UUID str = UUID.randomUUID();
        this.accountNumber = str.toString();
        // Random rand = new Random();
        // String str = rand.ints(0, 10).limit(10).mapToObj(c -> (char)c).collect(StringBuffer::new, StringBuffer::append, StringBuffer::append).toString();
        //this.accountNumber = "123456789";
        this.accountBalance = 0;
    }

    public BankAccount(String name, float begBal) {
        this.accountName = name;
        // Random rand = new Random();
        // String str = rand.ints(0, 10).limit(10).mapToObj(c -> (char)c).collect(StringBuffer::new, StringBuffer::append, StringBuffer::append).toString();
        // this.accountNumber = str;
        UUID str = UUID.randomUUID();
        this.accountNumber = str.toString();
        //this.accountNumber = "987654321";
        this.accountBalance = begBal;
    }

    // getter and setter
    public String getAccountName() {
        System.out.printf("Your account name is: %s\n" , accountName);
        return accountName;
    }
    // public void setAccountName(String accountName) {
    //     this.accountName = accountName;
    // }
    public String getAccountNumber() {
        System.out.printf("Your account number is: %s\n" , accountNumber);
        return accountNumber;
    }
    // public void setAccountNumber(String accountNumber) {
    //     this.accountNumber = accountNumber;
    // }
    public float getAccountBalance() {
        System.out.printf("Your account balance is: %f\n" , accountBalance);
        return accountBalance;
    }
    // public void setAccountBalance(float accountBalance) {
    //     this.accountBalance = accountBalance;
    // }
    public List<String> getTransactions() {
        System.out.printf("Transaction list: %s\n" , transactions);
        return transactions;
    }
    public void setTransactions(List<String> transactions) {
        this.transactions = transactions;
    }
    public boolean isIfClosed() {
        return ifClosed;
    }
    public void setIfClosed(boolean ifClosed) {
        this.ifClosed = ifClosed;
    }
    public Date getAccountCreationDate() {
        return accountCreationDate;
    }
    public void setAccountCreationDate(Date accountCreationDate) {
        this.accountCreationDate = accountCreationDate;
    }
    public Date getAccountClousureDate() {
        return accountClousureDate;
    }
    public void setAccountClousureDate(Date accountClousureDate) {
        this.accountClousureDate = accountClousureDate;
    }

    // behaviour
    public void deposit(float deposit) {
        if (deposit > 0) {
            this.accountBalance += deposit;
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
            LocalDateTime now = LocalDateTime.now();  
            String trx = "Deposited " + deposit + " " + "at" + " " + dtf.format(now);
            this.transactions.add(trx);
        }
        else
        {
            System.out.println(">>>Error<<< Please enter a valid deposit amount >>>Error<<<");
        }
    }
    public void withdraw(float withdraw) {
        if (withdraw > 0) {
            this.accountBalance -= withdraw;
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
            LocalDateTime now = LocalDateTime.now();  
            String trx = "Withdrawed " + withdraw + " " + "at" + " " + dtf.format(now);
            this.transactions.add(trx);
        }
        else
        {
            System.out.println(">>>Error<<< Please enter a valid withdrawal amount >>>Error<<<");
        }
     
    }
    // public void printBal() {
    //     System.out.printf("Your account balance is: %f\n" , accountBalance);
    // }
    // public void printAccount() {
    //     System.out.printf("Your account number is: %s\n" , accountNumber);
    // }
    // public void printName() {
    //     System.out.printf("Your account name is: %s\n" , accountName);
    // }

}
