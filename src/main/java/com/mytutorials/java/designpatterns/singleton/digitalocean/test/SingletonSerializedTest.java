package com.mytutorials.java.designpatterns.singleton.digitalocean.test;

import com.mytutorials.java.designpatterns.singleton.digitalocean.SerializedSingleton;

import java.io.*;

public class SingletonSerializedTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        SerializedSingleton instanceOne = SerializedSingleton.getInstance();

        // serialize
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("filename.ser"));
        out.writeObject(instanceOne);
        out.close();

        // deserialize from file to object
        ObjectInput in = new ObjectInputStream(new FileInputStream("filename.ser"));
        SerializedSingleton instanceTwo = (SerializedSingleton) in.readObject();
        in.close();

        System.out.println("instanceOne hashCode=" + instanceOne.hashCode()); //   instanceOne hashCode=806353501
        System.out.println("instanceTwo hashCode=" + instanceTwo.hashCode()); //   instanceTwo hashCode=1147985808
    }


}
