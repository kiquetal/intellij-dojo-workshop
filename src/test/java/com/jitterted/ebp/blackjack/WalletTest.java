package com.jitterted.ebp.blackjack;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
public class WalletTest
{
    @Test
    void testWalletBalanceIsInitiallyZer()
    {

        Wallet wallet = new Wallet();
        Assertions.assertThat(wallet.getBalance()).isEqualTo(0);
    }
}
