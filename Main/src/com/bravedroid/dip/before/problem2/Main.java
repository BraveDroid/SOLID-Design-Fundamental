package com.bravedroid.dip.before.problem2;

public class Main {
    public static void main(String[] args) {
        //the main is the client and it should be dependant on which is higher policy not the detail "the concrete class implementation"
        // the main is dependent on ServiceFactory and the Service Concrete class
        //the ServiceFactory is dependent also on the the Service concrete class
        ServiceFactory factory = new ServiceFactory();

        Client client = new Client();
        client.useService(factory);
    }
}
