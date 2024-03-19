package com.mytutorials.java.designpatterns.builder.digitalocean;

public class Computer {

    //required parameters
    private final String HDD;
    private final String RAM;

    // optional
    private final boolean isGraphicCardEnabled;
    private final boolean isBluetoothEnabled;

    // Only getters and no public constructor.
    public String getHDD() {
        return HDD;
    }

    public String getRAM() {
        return RAM;
    }

    public boolean isGraphicCardEnabled() {
        return isGraphicCardEnabled;
    }

    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    // private constructor with Builder Class as Argument
    private Computer(ComputerBuilder builder) {
        this.HDD = builder.HDD;
        this.RAM = builder.RAM;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
        this.isGraphicCardEnabled = builder.isGraphicCardEnabled;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "HDD='" + HDD + '\'' +
                ", RAM='" + RAM + '\'' +
                ", isGraphicCardEnabled=" + isGraphicCardEnabled +
                ", isBluetoothEnabled=" + isBluetoothEnabled +
                '}';
    }

    // Builder Class
    // 1) static nested class
    public static class ComputerBuilder {

        //required parameters
        private final String HDD;
        private final String RAM;

        // optional
        private boolean isGraphicCardEnabled;
        private boolean isBluetoothEnabled;

        // 2) public constructor with all required attributes
        public ComputerBuilder(String HDD, String RAM) {
            this.HDD = HDD;
            this.RAM = RAM;
        }

        // 3) setting optional attributes and then return the Builder Object (this)
        public ComputerBuilder setGraphicCardEnabled(boolean graphicCardEnabled) {
            this.isGraphicCardEnabled = graphicCardEnabled;
            return this;
        }

        // same ar 3)
        public ComputerBuilder setBluetoothEnabled(boolean bluetoothEnabled) {
            this.isBluetoothEnabled = bluetoothEnabled;
            return this;
        }

        // 4) Final stage build()
        public Computer build() {
            return new Computer(this);
        }
    }
}
