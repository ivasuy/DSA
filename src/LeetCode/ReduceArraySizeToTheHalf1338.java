package LeetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class ReduceArraySizeToTheHalf1338 {

    public static int minSetSize(int[] arr) {

        int length = arr.length;

        HashMap<Integer,Integer> map = new HashMap();

        for ( int num : arr ){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        ArrayList<Integer> freq = new ArrayList<>(map.values());

        Collections.sort( freq, Collections.reverseOrder());

        int count = 0;
        int el = length;
        int counter = 0;

        while ( el > length/2 ){
            el -= freq.get(counter);
            counter++;
            count++;
        }

        return count;
    }
}
