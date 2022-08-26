package LeetCode;

import java.util.HashMap;

public class SplitArrayIntoConsecutiveSubsequences659 {

    public boolean isPossible(int[] nums) {

        HashMap <Integer,Integer> available = new HashMap<>();

        HashMap <Integer,Integer> vacancy = new HashMap<>();

//         Adding values to hashMap

        for ( int i : nums ){

            available.put( i, available.getOrDefault(i,0) + 1 );

        }
//         iterate over array
        for ( int i = 0; i < nums.length; i++ ){
//             if frequency is less check for next
            if ( available.get(nums[i]) <= 0  ){

                continue;

            }
//             if vacancy is available
            else if ( vacancy.getOrDefault(nums[i],0) > 0 ){

                available.put( nums[i], available.getOrDefault(nums[i],0) - 1 );

                vacancy.put( nums[i], vacancy.getOrDefault(nums[i],0) - 1 );

                vacancy.put( nums[i]+1, vacancy.getOrDefault(nums[i]+1,0) + 1 );

            }
//             if not available
            else if ( available.getOrDefault(nums[i],0) > 0 && available.getOrDefault(nums[i]+1,0) > 0  && available.getOrDefault( nums[i]+2,0) > 0 ){

                available.put( nums[i], available.getOrDefault(nums[i],0) - 1 );

                available.put( nums[i]+1, available.getOrDefault(nums[i]+1,0) - 1 );

                available.put( nums[i]+2, available.getOrDefault(nums[i]+2,0) - 1 );

                vacancy.put( nums[i]+3, vacancy.getOrDefault(nums[i]+3,0) + 1 );
            }

            else{

                return false;
            }

        }

        return true;

    }
}
