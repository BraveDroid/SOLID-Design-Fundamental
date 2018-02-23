package com.bravedroid.dip.after.solution_to_problem2;


import com.bravedroid.dip.after.solution_to_problem2.concrete.ServiceFactory;
import com.bravedroid.dip.after.solution_to_problem2.contract.IServiceFactory;

public class Main {
    public static void main(String[] args) {
        //the Client class should be dependant on which is higher policy not the detail "the concrete class implementation"
        //the Client now is dependent on IServiceFactory and the IService the abstraction not the Concrete classes
        //the IServiceFactory is dependent also on the the IService concrete class

        //Dependencies are in one direction from concrete to abstract and it crosses the architectural boundary
        //this is the healthy flow of dependency as you don't have to depend on detail
        //And by applying these rules we are protecting the Client from changes in Service and serviceFactory

        //This contains a single dependency, so it violates the DIP.
        //This is typical DIP violations cannot be entirely removed,
        // but they can be gathered into a small number of concrete components and kept separate from the rest of the system.
        IServiceFactory factory = new ServiceFactory();

        Client client=new Client();
        client.useService(factory);
    }
}
