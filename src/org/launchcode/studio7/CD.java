package org.launchcode.studio7;

import java.util.ArrayList;

public class CD extends BaseDisc {
    String name;
    int storage; //74 minutes or 600 gigabytes
    ArrayList<String> tracks;
    String discType;

    CD (String name, int storage, String discType, String content) {
        super(name, storage, discType, content);

        //this.tracks = tracks;
    }

    @Override
    public void spinDisc() {
        System.out.println("CD spins at 200 - 500 rpm");
    }

    public void kittens() {
        System.out.println("Hello");
    }
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
