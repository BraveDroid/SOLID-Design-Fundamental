package com.bravedroid.dip.after;

public class Bank {
    private Management mManagement;
    private ClientsManager mClientsManager;
    private AccountsManager mAccountsManager;

    //the caller class of the Bank class do see the hidden dependencies
    public Bank(Management mManagement, ClientsManager mClientsManager, AccountsManager mAccountsManager) {
        this.mManagement = mManagement;
        this.mClientsManager = mClientsManager;
        this.mAccountsManager = mAccountsManager;
    }
}
