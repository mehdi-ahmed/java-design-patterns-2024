package com.mytutorials.java.designpatterns.factory.digitalocean;

public class Server extends Computer {

    private final String ram;
    private final String hdd;
    private final String cpu;

    public Server(String cpu, String hdd, String ram) {
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
    }

    @Override
    public String getRAM() {
        return this.ram;
    }

    @Override
    public String getHDD() {
        return this.hdd;
    }

    @Override
    public String getCPU() {
        return this.cpu;
    }
}
