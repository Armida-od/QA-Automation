package HW10_1;

import java.util.LinkedHashSet;
import java.util.List;

public class TestMethod {

    public static String testMethod(String str){

            String[] splitStr = str
                    .split(", |\\.");

            LinkedHashSet<String> uniqueStr = new LinkedHashSet<>(List.of(splitStr));
            char[] arrStr = uniqueStr.toString().toCharArray();
            for (int i = 1; i < arrStr.length; i++) {
                if (arrStr[i - 1] == ' ' && arrStr[i] != ' ')
                    arrStr[i] = Character.toUpperCase(arrStr[i]);
            }
            if (arrStr[0] != ' ')
                arrStr[0] = Character.toUpperCase(arrStr[0]);

            String stringStr = new String(arrStr)
                    .replace(", ", "\n")
                    .replaceAll("\\p{Punct}", "")
                    .replace(String.valueOf(arrStr[1]), String.valueOf(arrStr[1]).toUpperCase());
            System.out.println("****Your list:****");

            return stringStr;
    }
}
