package letterfreq;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Counter {

    public static HashMap<Character, Integer> count(String a) {
        Map<Character, Integer> characters = new TreeMap<>();

        for (char ch : a.toCharArray()) {
                if (Character.isAlphabetic(ch)) {
                    char uppercaseChar = Character.toUpperCase(ch);
                    characters.put(uppercaseChar, characters.getOrDefault(uppercaseChar, 0) + 1);
                }
        }

        return new HashMap<>(characters);
    }
}
