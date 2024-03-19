package com.mytutorials.java.designpatterns.builder.digitalocean;

public class ComputerBuilderTest {


    public static void main(String[] args) {

        // Using builder to get the object in a single line of code and
        // without any inconsistent state or arguments management issues

        Computer computer = new Computer.ComputerBuilder("500 GB", "2 GB")
                .setBluetoothEnabled(true)
                .setGraphicCardEnabled(true)
                .build();

        System.out.println("computer = " + computer);
    }
}
