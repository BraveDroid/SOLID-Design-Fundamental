package com.bravedroid.dip.before.problem2;

public class Client {
    void useService(ServiceFactory factory) {
        Service service = factory.makeService();
        service.start();
    }
}
