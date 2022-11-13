package ConcreteClasses;

import java.io.Serializable;

public class Room implements Serializable{
    private String roomNo;
    private String roomType;
    private double roomRent;

    public Room() {
    }

    public Room(String roomNo, String roomType) {
        this.roomNo = roomNo;
        this.roomType = roomType;
        
        if (roomType.equalsIgnoreCase("singleseator")) {
            this.roomRent = 12000;
        } else if (roomType.equalsIgnoreCase("biseator")) {
            this.roomRent = 10000;
        } else if (roomType.equalsIgnoreCase("triseator")) {
            this.roomRent = 8000;
        }
    }

    public String getRoomNo() {
        return this.roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    public String getRoomType() {
        return this.roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
        if(roomType.equalsIgnoreCase("singleseator")) {
            this.roomRent = 12000;
        } else if (roomType.equalsIgnoreCase("biseator")) {
            this.roomRent = 10000;
        } else if (roomType.equalsIgnoreCase("triseator")) {
            this.roomRent = 8000;
        }
    }

    public double getRoomRent() {
        return this.roomRent;
    }

    public void setRoomRent(double roomRent) {
        this.roomRent = roomRent;
    }


    @Override
    public String toString() {
        return 
            " Room No = " + getRoomNo() + "\n" +
            " Room Type = " + getRoomType() +  "\n" +
            " Room Rent = " + getRoomRent() + "\n";
    }

}
