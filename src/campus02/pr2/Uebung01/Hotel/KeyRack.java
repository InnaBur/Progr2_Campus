package campus02.pr2.Uebung01.Hotel;

public class KeyRack {

    Key[] keys;
    int numberOfRooms;

    public KeyRack(int numberOfRooms) {
        this.keys = new Key[numberOfRooms];
        this.numberOfRooms = numberOfRooms;
    }

    public Key[] getKeys() {
        return keys;
    }

    public void setKeys(Key[] keys) {
        this.keys = keys;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public void giveKeyToGuest(Guest guest) {
        Key key = keys[guest.getRoomNumber()];
        if (key != null) {
            guest.setKey(key);
            key.setWithGuest(true);
            keys[guest.getRoomNumber()] = null;
        } else {
            System.out.println("Police! Key is missing! ");
        }

//        for (int i = 0; i < keys.length; i++) {
//            if (keys[i] == null) {
//                keys[i] = new Key(i);
//                guest.setRoomNumber(i);
//                keys[i].setWithGuest(true);
//                keys[i].setRoomNumber(i);
//                guest.setKey(keys[i]);
//            }
//        }
    }

    public void takeKeyBackFromGuest(Guest guest) {
        int room = guest.getRoomNumber();
        Key key = guest.getKey();
        key.setWithGuest(false);
        keys[room] = key;
        guest.setKey(null);
    }

    public void showKeyRack() {
        for (int i = 0; i < keys.length; i++) {
            System.out.println(keys[i]);
        }
    }

    public void showKeyRackInProz() {
        int count = 1;
        for (int i = count; i <= keys.length; i++) {
            for (int j = 0; j < 3; j++) {
                if (count == keys.length) {
                    break;
                }
                if (keys[count] != null && keys[count].isWithGuest()) {
                    System.out.print("Room " + count + " is occupied     ");
                    count++;
                } else {
                    System.out.print("Key fromm room " + count + "      ");
                    count ++;
                }
            }
            System.out.println();
        }
    }
}
