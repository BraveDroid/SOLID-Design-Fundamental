package com.bravedroid.dip.before;

public class Bank {
    private Management mManagement;
    private ClientsManager mClientsManager;
    private AccountsManager mAccountsManager;

    //the caller class of the Bank class does not see the hidden dependencies
    public Bank() {
        mManagement = new Management();
        mClientsManager = new ClientsManager();
        mAccountsManager = new AccountsManager();
    }
}
