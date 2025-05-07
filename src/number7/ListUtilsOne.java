package number7;

import java.util.ArrayList;
import java.util.List;

public class ListUtilsOne {
    public static List<Integer> toList(int[] array){
        List<Integer> list = new ArrayList<>();
        for (int num: array){
            list.add(num);
        }
        return list;
    }
}
