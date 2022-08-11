package LeetCode;

public class MajorityElement169 {
    public static void main(String[] args) {

        int [] nums = { 3, 3, 4};
        System.out.println(majorityElement(nums));
    }

    static public int majorityElement(int[] nums) {

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
