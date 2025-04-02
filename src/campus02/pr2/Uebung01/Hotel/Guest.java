package campus02.pr2.Uebung01.Hotel;

import javax.xml.namespace.QName;

public class Guest {

    Key key;
    int roomNumber;
    String name;

    public Guest(Key key, int roomNumber, String name) {
        this.key = key;
        this.roomNumber = roomNumber;
        this.name = name;
    }

    public Guest(String name) {
        this.name = name;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
