package HW11;

import java.util.*;

public class Main_HW11 {
    public static void main(String[] args) {
        Map<Integer, String> userPerson = new HashMap<>();
        userPerson.put(40, "Anton");
        userPerson.put(28, "Igor");
        userPerson.put(24, "Ivan");
        userPerson.put(36, "Viktor");
        userPerson.put(42, "Denis");

        infoList(userPerson);
    }

    public static void infoList(Map<Integer, String> getValue) {
        Map<Integer, String> uniqGetValue = new TreeMap<>(getValue);

        for (Map.Entry<Integer, String> s : uniqGetValue.entrySet()) {
            System.out.println(s);
        }
    }

}
