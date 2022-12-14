package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class MajorityElement229 {

    public List<Integer> majorityElement(int[] nums) {

        List<Integer> res = new ArrayList<Integer>();

//      Boyer Moore’s Voting Algorithm
        int num1 = 0;
        int num2 = 0;

        int count1 = 0;
        int count2 = 0;

//      findind majority element
        for ( int num : nums ){

            if ( num1 == num ){
                count1++;
            }
            else if ( num2 == num ){
                count2++;
            }

            else if ( count1 == 0 ){
                num1 = num;
                count1 = 1;
            }
            else if ( count2 == 0 ){
                num2 = num;
                count2 = 1;
            }

            else{
                count1--;
                count2--;
            }

        }
//      finding frequency of majority element
        count1 = 0;
        count2 = 0;
        for ( int  num : nums ){
            if ( num1 == num ){
                count1++;
            }
            else if ( num2 == num ){
                count2++;
            }
        }

        if ( count1 > nums.length/3){
            res.add(num1);
        }

        if ( count2 > nums.length/3){
            res.add(num2);
        }

        return res;
    }
}
