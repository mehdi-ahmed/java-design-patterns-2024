package com.mytutorials.java.designpatterns.factory.digitalocean;

public class TestFactoryMain {

    public static void main(String[] args) {

        // decoupling implementation class from client via the Factory 'ComputerFactory'
        Computer pc = ComputerFactory.getComputer("pc", "2 GB", "1TB", "AMD");
        Computer server = ComputerFactory.getComputer("server", "20 GB", "100TB", "Intel");

        System.out.println("Factory PC config:: " + pc);
        System.out.println("Factory Server config:: " + server);
    }
}
