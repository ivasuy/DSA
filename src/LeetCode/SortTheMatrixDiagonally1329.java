package LeetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SortTheMatrixDiagonally1329 {
    public int[][] diagonalSort(int[][] mat) {

        int rowL = mat.length;
        int colL = mat[0].length;

        Map<Integer, PriorityQueue<Integer>> map = new HashMap<>();

        for ( int i = 0; i < rowL; i++ ){
            for( int j = 0; j < colL; j++ ){

                int diagonalVal = i - j;
                PriorityQueue<Integer> pq = map.getOrDefault(diagonalVal, new PriorityQueue<>());
                pq.add(mat[i][j]);
                map.put(diagonalVal,pq);
            }
        }

        for ( int i = 0; i < rowL; i++ ){
            for( int j = 0; j < colL; j++ ){

                int diagonalVal = i - j;
                PriorityQueue<Integer> pq = map.get(diagonalVal);
                mat[i][j] = pq.poll();
            }
        }

        return mat;

    }
}
