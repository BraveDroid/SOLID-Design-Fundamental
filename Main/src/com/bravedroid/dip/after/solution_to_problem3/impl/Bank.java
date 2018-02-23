package com.bravedroid.dip.after.solution_to_problem3.impl;

import com.bravedroid.dip.after.solution_to_problem3.contract.IAccountsManager;
import com.bravedroid.dip.after.solution_to_problem3.contract.IBank;
import com.bravedroid.dip.after.solution_to_problem3.contract.IClientsManager;
import com.bravedroid.dip.after.solution_to_problem3.contract.IManagement;

public class Bank implements IBank {
    private IManagement mManagement;
    private IClientsManager mClientsManager;
    private IAccountsManager mAccountsManager;

    //the caller class of the Bank class do see the hidden dependencies
    public Bank(IManagement mManagement, IClientsManager mClientsManager, IAccountsManager mAccountsManager) {
        this.mManagement = mManagement;
        this.mClientsManager = mClientsManager;
        this.mAccountsManager = mAccountsManager;
    }
}
