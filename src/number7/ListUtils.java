package number7;

import java.util.List;

public class ListUtils {
    public static int countOccurnce(List<String> list, String target){
        int count = 0;
        for (String word: list){
            if (word.equals(target)){
                count++;
            }
        }
        return count;
    }
}
