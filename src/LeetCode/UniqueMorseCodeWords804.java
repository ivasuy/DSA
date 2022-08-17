package LeetCode;

import java.util.HashSet;

public class UniqueMorseCodeWords804 {
    public int uniqueMorseRepresentations(String[] words) {

        HashSet<String> res = new HashSet();

        String[] MORSE = new String[]{".-","-...","-.-.","-..",".","..-.","--.",
                "....","..",".---","-.-",".-..","--","-.",
                "---",".--.","--.-",".-.","...","-","..-",
                "...-",".--","-..-","-.--","--.."};

        for ( String word : words ){

            StringBuilder transformation = new StringBuilder();

            for ( char c : word.toCharArray() ){

                transformation.append(MORSE[c-'a']);

            }

            res.add(transformation.toString());
        }

        return res.size();
    }
}
