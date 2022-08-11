package LeetCode;

public class MajorityElement169 {

     public int majorityElement(int[] nums) {

        // Moore’s Voting Algorithm
        int count = 0;
        int majElement = 0;

        for ( int num : nums ){

            if( count == 0 ){
                majElement = num;
            }
            if ( majElement == num ){
                count++;
            }
            else{
                count--;
            }
        }

        return majElement;
    }
}
