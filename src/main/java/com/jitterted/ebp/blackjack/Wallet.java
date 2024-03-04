package com.jitterted.ebp.blackjack;

public class Wallet
{

    private int balance = 0;

    public boolean isEmpty()
    {
        return true;
    }

    public Wallet()
    {

    }

    public int getBalance()
    {

        return balance;
    }

    public void deposit(int i)
    {
        this.balance = i;
    }
}
