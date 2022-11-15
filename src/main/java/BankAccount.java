import java.time.LocalDate;

public class BankAccount {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private int accountNumber;
    private String accountType;
    private double balance = 0;

    public BankAccount(String firstName, String lastName, LocalDate dateOfBirth, int accountNumber, String accountType){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.accountNumber = accountNumber;
        this. accountType = accountType;

    }

    public void deposit(double depositValue){
        this.balance= (balance +depositValue);
    }

    public void withdrawal(double withdrawalValue){
        this.balance= (balance -withdrawalValue);
    }

    public void payInterest(double interestValue){
        if (this.accountType== "Savings Account"){
            this.balance= (balance*(interestValue+0.01));
        }
        else{
            this.balance= (balance*interestValue);
        }
    }


    //getter and setter

    public String getFirstName(){
        return this.firstName;
    }

    public void setFirstName(String firstName1){
        this.firstName = firstName1;

    }

    public String getLastName(){
        return this.lastName;
    }

    public void setLastName(String lastName1){
        this.lastName = lastName1;

    }

    public LocalDate getDateOfBirth(){
        return this.dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth1){
        this.dateOfBirth = dateOfBirth1;

    }

    public int getAccountNumber(){
        return this.accountNumber;
    }

    public void setAccountNumber(int accountNumber1){
        this.accountNumber = accountNumber1;
    }

    public double getBalance(){
        return this.balance;
    }

    public void setBalance(double balance1){
        this.balance = balance1;
    }

    public String getAccountType(){
        return this.accountType;
    }

    public void setAccountType(String accountType1){
        this.accountType = accountType1;
    }
}
