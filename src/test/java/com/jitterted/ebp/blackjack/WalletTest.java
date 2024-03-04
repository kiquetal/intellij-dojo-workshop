package com.jitterted.ebp.blackjack;
import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class WalletTest
{
    @Test
    void testWalletBalanceIsInitiallyZer()
    {
        Wallet walletObject = new Wallet();
        assertThat(walletObject.getBalance()).isEqualTo(0);

    }

    @Test
    void testNothing()
    {
        assertThat(0).isZero();

    }

    @Test
    void testAddMoney()
    {
        Wallet newWallet = new Wallet();
        newWallet.deposit(100);
        assertThat(newWallet.getBalance()).isEqualTo(100);
    }
}
