package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        BaseDisc myDVD = new DVD("Space Jam", 500, "DVD", "MP4");
        myDVD.spinDisc();
        BaseDisc myCD = new CD ("Breakfast", 500, "CD", "MP3");
        myCD.spinDisc();

        CD Eden = (CD) myCD;

        Eden.kittens();

        // TODO: Call each CD and DVD method to verify that they work as expected.

    }
}
