package campus02.pr2.Uebung01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SeriesTracker {

    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> seriesTracker = new HashMap<>();

        ArrayList<String> romanceSeries = new ArrayList<>();

        romanceSeries.add("You");
        romanceSeries.add("How I met your mother");
        romanceSeries.add("Game of Thrones");

        ArrayList<String> crimeSeries = new ArrayList<>();
        crimeSeries.add("Law and Order");
        crimeSeries.add("Dexter");
        crimeSeries.add("Castle");
        crimeSeries.add("Slow Horses");
        crimeSeries.add("Sherlock Holmes");
        crimeSeries.add("Kommissar Rex");
        crimeSeries.add("CSS");

        ArrayList<String> comedySeries = new ArrayList<>();
        comedySeries.add("Scrubs");
        comedySeries.add("Two broke girls");
        comedySeries.add("Brooklyn 99");
        comedySeries.add("The Big Bang Theory");
        comedySeries.add("Community");
        comedySeries.add("The good place");

        seriesTracker.put("Romance", romanceSeries);
        seriesTracker.put("Comedy", comedySeries);
        seriesTracker.put("Crime", crimeSeries);

        for (Map.Entry<String, ArrayList<String>> entry: seriesTracker.entrySet()) {
            if (entry.getKey().equals("Comedy")) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }

        System.out.println("--------------------------");

        for (String key : seriesTracker.keySet()) {
            if (key.equals("Comedy")) {
                System.out.println(seriesTracker.get(key));
            }
        }

        System.out.println("--------------------------");

        if (seriesTracker.containsKey("Comedy")) {
            System.out.println(seriesTracker.get("Comedy"));
        }

        System.out.println("--------------------------");

        //Bekommen alles im List
        for (Map.Entry<String, ArrayList<String>> entry: seriesTracker.entrySet()) {
            for (String series: entry.getValue()) {
                System.out.println(series);
            }
            System.out.println();
        }
        System.out.println("--------------------------");
    }


}
