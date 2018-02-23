package com.bravedroid.dip.after.solution_to_problem2.concrete;

import com.bravedroid.dip.after.solution_to_problem2.contract.IServiceFactory;

public class ServiceFactory implements IServiceFactory {
    public Service makeService() {
        return new Service();
    }
}
