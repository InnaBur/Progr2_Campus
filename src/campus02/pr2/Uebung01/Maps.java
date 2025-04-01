package campus02.pr2.Uebung01;

import java.util.HashMap;
import java.util.Map;

public class Maps {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Graz", 306068);
        map.put("Vienna", 2005500);
        map.put("Linz", 212538);
        map.put("New York", 19007100);
        map.put("London", 8866180);
        map.put("Beijing", 22000000);


        //drei Arten, wie man durch map drübergehen kann
        for (String key : map.keySet()) {
            System.out.println(key + " has a population of " + map.get(key));
        }

        for (Integer value : map.values()) {
            System.out.println(value);
        }

        for (Map.Entry<String, Integer> entries : map.entrySet()) {
            System.out.println(entries.getKey() + " " + entries.getValue());
        }

        //delete value
        map.remove("London");

        for (Integer value : map.values()) {
            if (value > 2000000) {
                System.out.println(value);
            }
        }

        for (Map.Entry<String, Integer> entries : map.entrySet()) {
            if (entries.getValue() >= 1000000) {
                System.out.println(entries.getKey());
            }
        }

        map.replace("Graz", 306068, 306075);

        System.out.println("Graz new population: " + map.get("Graz"));

        map.replace("Graz", 306080);
        System.out.println("Graz new population: " + map.get("Graz"));

    }
}
