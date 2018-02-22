package com.bravedroid.dip.before;

public class Client {
    void useTheBank() {
        //Here the client of the bank class will have no control on the Bank class dependencies
        Bank bank = new Bank();
    }
}
