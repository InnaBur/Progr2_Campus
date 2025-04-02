package campus02.pr2.Uebung01.Hotel;

public class Reception {

    public static void main(String[] args) {

        Guest guest = new Guest(null, 1, "Somebody");

        KeyRack keyRack = new KeyRack(3);
        Key key1 = new Key(0, false);
        Key key2 = new Key(1, false);
        Key key3 = new Key(2, false);

        keyRack.getKeys()[0] = key1;
        keyRack.getKeys()[1] = key2;
        keyRack.getKeys()[2] = key3;

        keyRack.showKeyRack();
        System.out.println("------");
//        Guest me = new Guest(null, 1, "Inna");

        keyRack.giveKeyToGuest(guest);
        keyRack.showKeyRack();
        System.out.println("------");

        keyRack.takeKeyBackFromGuest(guest);
        keyRack.showKeyRack();
        System.out.println("------");



        System.out.println(guest.getKey());

    }
}
