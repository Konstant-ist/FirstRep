package number7;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListUtilsThird {
    public static int calcOccurance(List<String> list) {
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : list) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        return 0;
    }
}
