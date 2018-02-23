package com.bravedroid.dip.after.solution_to_problem3;


import com.bravedroid.dip.after.solution_to_problem3.contract.IAccountsManager;
import com.bravedroid.dip.after.solution_to_problem3.contract.IBank;
import com.bravedroid.dip.after.solution_to_problem3.contract.IClientsManager;
import com.bravedroid.dip.after.solution_to_problem3.contract.IManagement;
import com.bravedroid.dip.after.solution_to_problem3.impl.factories.BankFactory;
import com.bravedroid.dip.after.solution_to_problem3.impl.AccountsManager;
import com.bravedroid.dip.after.solution_to_problem3.impl.Bank;
import com.bravedroid.dip.after.solution_to_problem3.impl.ClientsManager;
import com.bravedroid.dip.after.solution_to_problem3.impl.Management;

public class Client {
    void useTheBank() {
        //Here the client of the bank class will have full control on the Bank class dependencies,
        Bank bank = new Bank(new Management(), new ClientsManager(), new AccountsManager());
    }

   //(dependency injection factories) would help us to get the needed subType
    void useTheBank2(IManagement management, IClientsManager clientsManager, IAccountsManager accountsManager) {
        //Here the client of the bank class will have full control on the Bank class dependencies,
        //using the BankFactory which is also a dependency, but the only dependency to a detail concrete class.
        IBank bank =  BankFactory.create(management, clientsManager, accountsManager);
    }
}
