package com.bravedroid.dip.after.solution_to_problem2;


import com.bravedroid.dip.after.solution_to_problem2.contract.IService;
import com.bravedroid.dip.after.solution_to_problem2.contract.IServiceFactory;

public class Client {
    void useService(IServiceFactory factory) {
        IService service = factory.makeService();
        service.start();
    }
}
