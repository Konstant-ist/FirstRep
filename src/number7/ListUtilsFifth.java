package number7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListUtilsFifth {
    public static List<ListUtilsFourth> findOccurrance(List<String> list){
        Map<String,Integer> wordCount =new HashMap<>();
        for (String word: list){
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        List<ListUtilsFourth> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry: wordCount.entrySet()){
            result.add(new ListUtilsFourth());
        }
        return result;
    }
}
