package com.bravedroid.dip.after.solution_to_problem3.impl.factories;

import com.bravedroid.dip.after.solution_to_problem3.contract.IAccountsManager;
import com.bravedroid.dip.after.solution_to_problem3.contract.IBank;
import com.bravedroid.dip.after.solution_to_problem3.contract.IClientsManager;
import com.bravedroid.dip.after.solution_to_problem3.contract.IManagement;
import com.bravedroid.dip.after.solution_to_problem3.impl.Bank;

public class BankFactory {
    public static IBank create(IManagement management, IClientsManager clientsManager, IAccountsManager accountsManager) {
        return new Bank(management, clientsManager, accountsManager);
    }
}
