package LeetCode;

public class FirstUniqueCharacterInAString387 {

    static public int firstUniqChar(String s) {

        for ( char c : s.toCharArray() ){ 

            int index = s.indexOf(c);
            int lastIndex = s.lastIndexOf(c);
            
// because if my first occurrence is my last occurrence I found my answere
            if ( index == lastIndex ){
                return index;
            }
        }

        return -1;
    }
}
// complexity o(n^2)

