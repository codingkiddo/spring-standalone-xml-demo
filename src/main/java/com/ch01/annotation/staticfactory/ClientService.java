package com.ch01.annotation.staticfactory;

public class ClientService {

	private static ClientService clientService = new ClientService();
    private ClientService() {}

    public static ClientService createInstance() {
    	System.out.println("createInstance() called ......");
        return clientService;
    }
}
