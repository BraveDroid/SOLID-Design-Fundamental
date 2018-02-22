package com.bravedroid.dip.after;


public class Client {
    void useTheBank() {
        //Here the client of the bank class will have full control on the Bank class dependencies,
        // it will uses the Bank class which dosen't have dependencies of Management, ClientManager and AccountManager
        Bank bank = new Bank(new Management(), new ClientsManager(), new AccountsManager());
    }
}
