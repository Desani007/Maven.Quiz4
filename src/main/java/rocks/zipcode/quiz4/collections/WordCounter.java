package rocks.zipcode.quiz4.collections;

import java.lang.reflect.Array;
import java.util.*;

public class WordCounter {
    List<String> strings;

    public WordCounter(String... strings) {
        this.strings= Arrays.asList(strings);
    }

    public Map<String, Integer> getWordCountMap() {
        Map map = new HashMap();
        for (String s: strings){
            int frequency =Collections.frequency(strings,s);
            map.put(s,frequency);
        }


        return map;
    }
}
