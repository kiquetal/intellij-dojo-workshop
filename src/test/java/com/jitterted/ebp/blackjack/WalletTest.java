package com.jitterted.ebp.blackjack;
import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class WalletTest
{
    @Test
    void testWalletBalanceIsInitiallyZer()
    {
        Wallet wallet = new Wallet();
        assertThat(wallet.getBalance()).isEqualTo(0);

    }

    @Test
    void testNothing()
    {

        assertThat(0).isZero();
    }
}
