package rooms;

import Interfaces.Door;

public class Garage implements Door {
    private boolean flagOpenDoor_;
    private boolean flagBlockDoor_;
    public Garage() {
        this.flagOpenDoor_ = false;
        this.flagBlockDoor_ = true;
    }

    public boolean isFlagOpenDoor_() {
        return flagOpenDoor_;
    }

    public boolean isFlagBlockDoor_() {
        return flagBlockDoor_;
    }

    @Override
    public void lock() {
        this.flagBlockDoor_ = true;
        this.flagOpenDoor_ = false;
    }

    @Override
    public void unlock() {
        this.flagBlockDoor_ = false;
        this.flagOpenDoor_ = false;
    }

    @Override
    public void open() {
        if (flagBlockDoor_ == true) {
            System.out.println("Door is block! \nnot open door");
        }
        else {
            this.flagOpenDoor_ = true;
        }
    }

    @Override
    public void close() {
        this.flagOpenDoor_ = false;
    }

    @Override
    public String toString() {
        return "Garage{" +
                "flag Open Door_=" + flagOpenDoor_ +
                ", flag Block Door_=" + flagBlockDoor_ +
                '}';
    }
}
