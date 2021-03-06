package DesignPatterns.Prototype;

import java.util.HashMap;
import java.util.Map;


public class Factory {

    private static final Map<String, Person> prototypes = new HashMap<>();

    static {
        prototypes.put("tom", new Tom());
        prototypes.put("dick", new Dick());
        prototypes.put("harry", new Harry());
    }

    public static Person getPrototype(String type) {
        try {
            return prototypes.get(type).clone();
        } catch (NullPointerException exception) {
            System.out.println("Prototype with the name " + type + "does not exist");
        }
        return null;
    }
}
