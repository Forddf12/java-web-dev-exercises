package bankstuff.tests;

import accounts.BankAccount;
import org.launchcode.java.exercises.bankstuff.accounts.BankAccount;
import org.junit.Assert.assertEquals;
import org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BankAccountTests {

    private int accountNo;
    private double balance;

    private BankAccount ba;

    @Before
    public void makeBankAccount() {
        ba = new BankAccount(10);
    }

    @Test
    public void testSimpleDeposit() {
        ba.deposit(1);
        assertEquals(11, ba.getBalance(), 0.001);
    }

//    @Test(expected = IllegalArgumentException.class)
//    public void testDepositNegativeValue() {
//        ba.deposit(-2);
//        fail("Should not be able to deposit a negative amount");
//    }

    //@Test
   //public  void testSimpleWithdrawal() {
        //do we allow balance to go negative?
        //ba.withdraw(5);
        //assertEquals(-5, ba.getBalance());
    //}

    //@Test(expected = IllegalArgumentException.class)
    //public void testWithdrawalNegativeValue() {
        //ba.withdraw(-2);
        //fail("Should not be able to witdraw a negative amoung");
    //}


}
