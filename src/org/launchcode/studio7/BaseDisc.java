package org.launchcode.studio7;

public abstract class BaseDisc implements OpticalDisc {
    int storageCapacity; // 10 tracks of storage.
    int remainingCapacity; // Add 9 tracks = 1 remaining capacity
    int capacityUsed;
    String name; // Clarissa - "Faith!"
    String content; //MP3, MP4
    String discType;

    BaseDisc(String name, int storage, String discType, String content) { //
        // 600 3
        this.name = name;
        this.content = content;
        this.storageCapacity = storage;
        this.discType = discType;
    }

}
