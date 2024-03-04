package com.jitterted.ebp.blackjack;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WalletTest
{
    @Test
    void testWalletBalanceIsInitiallyZer()
    {
        Wallet wallet = new Wallet();
        assertThat(wallet.getBalance()).isEqualTo(0);
    }
}
