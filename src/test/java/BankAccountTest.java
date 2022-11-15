import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {

    private BankAccount bank1;
    private BankAccount bank2;


    @BeforeEach
    public void setUp(){
        bank1 = new BankAccount("Shawn", "Augustine", LocalDate.of(2001,01,04), 453, "Savings Account");
        bank2 = new BankAccount("Drew", "Timbs", LocalDate.of(1995,04,22), 239, "Current Account");

    }

    @Test
    public void hasFirstName(){
        assertThat(bank1.getFirstName()).isEqualTo("Shawn");
        assertThat(bank2.getFirstName()).isEqualTo("Drew");
        bank1.setFirstName("Yimit");
        bank2.setFirstName("Rat");
        assertThat(bank1.getFirstName()).isEqualTo("Yimit");
        assertThat(bank2.getFirstName()).isEqualTo("Rat");

    }
    @Test
    public void hasLastName(){
        assertThat(bank1.getLastName()).isEqualTo("Augustine");
        assertThat(bank2.getLastName()).isEqualTo("Timbs");
        bank1.setLastName("Frog");
        bank2.setLastName("Earl");
        assertThat(bank1.getLastName()).isEqualTo("Frog");
        assertThat(bank2.getLastName()).isEqualTo("Earl");

    }

    @Test
    public void hasDateOfBirth(){
        assertThat(bank1.getDateOfBirth()).isEqualTo(LocalDate.of(2001,01,04));
        assertThat(bank2.getDateOfBirth()).isEqualTo(LocalDate.of(1995,04,22));
        bank1.setDateOfBirth(LocalDate.of(1999, 05, 01));
        bank2.setDateOfBirth(LocalDate.of(1998, 04, 9));
        assertThat(bank1.getDateOfBirth()).isEqualTo(LocalDate.of(1999, 05, 01));
        assertThat(bank2.getDateOfBirth()).isEqualTo(LocalDate.of(1998, 04, 9));

    }

    @Test
    public void hasAccountNumber(){
        assertThat(bank1.getAccountNumber()).isEqualTo(453);
        assertThat(bank2.getAccountNumber()).isEqualTo(239);
        bank1.setAccountNumber(999);
        bank2.setAccountNumber(5);
        assertThat(bank1.getAccountNumber()).isEqualTo(999);
        assertThat(bank2.getAccountNumber()).isEqualTo(5);

    }

    @Test
    public void hasBalance(){
        assertThat(bank1.getBalance()).isEqualTo(0);
        assertThat(bank2.getBalance()).isEqualTo(0);
        bank1.setBalance(1000);
        bank2.setBalance(2000);
        assertThat(bank1.getBalance()).isEqualTo(1000);
        assertThat(bank2.getBalance()).isEqualTo(2000);


    }

    @Test
    public void checkDeposit(){
        bank1.setBalance(1000);
        bank1.deposit(500);
        assertThat(bank1.getBalance()).isEqualTo(1500);
        bank2.setBalance(2000);
        bank2.deposit(1000);
        assertThat(bank2.getBalance()).isEqualTo(3000);

    }

    @Test
    public void checkWithdrawal(){
        bank1.setBalance(1500);
        bank1.withdrawal(400);
        assertThat(bank1.getBalance()).isEqualTo(1100);
        bank2.setBalance(3000);
        bank2.withdrawal(900);
        assertThat(bank2.getBalance()).isEqualTo(2100);

    }

    @Test
    public void checkInterest(){
        bank1.setBalance(1000);
        bank1.payInterest(1.05);
        assertThat(bank1.getBalance()).isEqualTo(1060);
        bank2.setBalance(2000);
        bank2.payInterest(1.02);
        assertThat(bank2.getBalance()).isEqualTo(2040);

    }

    @Test
    public void checkAccountType(){
        assertThat(bank1.getAccountType()).isEqualTo("Savings Account");
        assertThat(bank2.getAccountType()).isEqualTo("Current Account");

        bank1.setAccountType("Current Account");
        bank2.setAccountType("Savings Account");
        assertThat(bank1.getAccountType()).isEqualTo("Current Account");
        assertThat(bank2.getAccountType()).isEqualTo("Savings Account");




    }



}
