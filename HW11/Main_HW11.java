package HW11;

import java.util.Map;
import java.util.TreeMap;

public class Main_HW11 {
    public static void main(String[] args) {
        Map<Integer, String> userPerson = new TreeMap<>();
        userPerson.put(40, "Anton");
        userPerson.put(28, "Igor");
        userPerson.put(24, "Ivan");
        userPerson.put(36, "Viktor");
        userPerson.put(42, "Denis");

        infoList(userPerson);
    }

    public static void infoList(Map<Integer, String> getValue) {
        for (Map.Entry<Integer, String> userList : getValue.entrySet()) {
            System.out.println(userList);
        }
    }

}
