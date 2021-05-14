package org.launchcode.studio7;

import java.util.ArrayList;

public class DVD extends BaseDisc {
    String name;
    int storage; //74 minutes or 600 gigabytes
    ArrayList<String> tracks;
    String discType;
    String contents;
    // TODO: Implement your custom interface.

    DVD(String name, int storage, String discType, String content) {
        super(name, storage, discType, content);
    }

    @Override
    public void spinDisc() {
        System.out.println("DVD spins at 500-2billion rpm");
    }

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
