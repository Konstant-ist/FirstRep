package number7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("cat","uncle","dog","bird", "uncle");
        System.out.println("countOccurrance: " + ListUtils.countOccurnce(words, "uncle"));


        int[] numbers = {1,2,3,4,5,5,3,6,7,8,9};
        List<Integer> numberList = ListUtilsOne.toList(numbers);
        System.out.println("toList: " + numberList);


        List<Integer> count = Arrays.asList(1,2,3,4,5,6,7,8,9,6,43);
        System.out.println("findUnique: " + ListUtilsSecond.findUnique(count));


        System.out.println("calcOccurrance:");
        ListUtilsThird.calcOccurance(words);


        System.out.println("findOccurrance: " + ListUtilsFifth.findOccurrance(words));
    }
}
