package com.thoughtworks.tddintro.exercises.accountbalance;

//import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class AccountTests {
    @Test
    public void shouldIncreaseMyBalanceWhenIDepositMoney(){
        Account account = new Account(100);
        account.depositMoney(50);
        assertThat(account.getMoney(),is(150));
    }

    @Test
    public void shouldDecreaseMyBalanceWhenIWithdrawMoney(){
        Account account = new Account(100);
        account.withdrawMoney(50);
        assertThat(account.getMoney(),is(50));
    }

    @Test
    public void shouldNotDecreaseMyBalanceWhenIWithdrawMoneyAndDoNotHaveEnoughToCoverTheWithdrawal(){
        Account account = new Account(50);
        account.withdrawMoney(100);
        assertThat(account.getMoney(),is(50));
    }
}
