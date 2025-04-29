package campus02.pr2.Ue0428_Vererbung;

import java.util.ArrayList;
import java.util.List;

public class Orchester {
    private List<Instrument> orchester;

    public Orchester() {
        this.orchester = new ArrayList<>();
    }

    public void addInstrument (Instrument instrument) {
        orchester.add(instrument);
    }

    public int playAll() {
        int laut = 0;

        for (Instrument instrument: orchester) {
            laut = laut + instrument.play();
        }
        return laut;
    }

}
