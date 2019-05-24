import Interfaces.Door;
import Interfaces.Light;
import lights.LightGarage;
import lights.LightHouse;
import rooms.Garage;
import rooms.House;

public class FascadaApi {

    private Light lightGarage_ = new LightGarage();
    private Light lightHouse_ = new LightHouse();
    private Garage garage_ = new Garage();
    private House house_ = new House();

    public void unLockHouse() {
        System.out.println("UNLOCK HOUSE");
        this.house_.unlock();
    }

    public void lockHouse() {
        System.out.println("LOCK HOUSE");
        this.house_.lock();
        this.lightHouse_.off();
    }

    public void unLockGarage() {
        System.out.println("UNLOCK GARAGE");
        this.garage_.unlock();
    }

    public void lockGarage() {
        System.out.println("LOCK GARAGE");
        this.garage_.lock();
        this.lightGarage_.off();
    }

    public void openDoorHouse() {
        if (house_.isFlagBlockDoor_()) {
            System.out.println("DOOR LOCK\nDON'T DO THAT");
        } else {
            System.out.println("OPEN DOOR HOUSE\nLIGHT HOUSE");
            this.house_.open();
            this.lightHouse_.on();
        }
    }

    public void closeDoorHouse() {
        System.out.println("CLOSE DOOR HOUSE\nDARK HOUSE");
        this.house_.close();
        this.lightHouse_.off();
    }

    public void openDoorGarage() {
        if (garage_.isFlagBlockDoor_() == true) {
            System.out.println("GARAGE LOCK\nDON'T DO THAT");
        } else {
            System.out.println("OPEN DOOR GARAGE\nLIGHT GARAGE");
            this.garage_.open();
            this.lightGarage_.on();
        }
    }
    public void closeDoorGarage() {
        System.out.println("CLOSE DOOR GARAGE\nDARK GARAGE");
        this.garage_.close();
        this.lightGarage_.off();
    }

    @Override
    public String toString() {
        return lightGarage_ + "\n" +
                lightHouse_ +"\n" +
                garage_ +"\n" +
                house_+"\n" ;
    }
}
