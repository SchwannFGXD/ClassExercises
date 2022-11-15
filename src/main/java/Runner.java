import java.time.LocalDate;

public class Runner {
    public static void main(String[] args) {
        BankAccount bank1 = new BankAccount("Shawn", "Augustine", LocalDate.of(2001,01,04), 453, "Savings Account");
        bank1.setFirstName("Yimit");
        bank1.setLastName("Frog");
        bank1.setDateOfBirth(LocalDate.of(1999, 05, 01));
        bank1.setAccountNumber(999);
        bank1.setBalance(1000);
        bank1.deposit(500);
        System.out.println(bank1.getBalance());
        bank1.withdrawal(400);
        System.out.println(bank1.getBalance());
        bank1.setBalance(1000);
        bank1.payInterest(1.05);
        System.out.println(bank1.getBalance());








    }
}
