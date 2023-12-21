package org.example;

public class Laptop extends Computer {

    String lapProp1;

    public Laptop(String prop1, String prop2, String prop3, String aLapProp) {
        super(prop1, prop2, prop3);
        lapProp1 = aLapProp;
    }
}
