package LeetCode;

import java.util.Collections;
import java.util.PriorityQueue;

public class MinimumNumberOfRefuelingStops871 {

    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        int current = startFuel;
        int res = 0;

//         max heap for fuel
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());

//         travese through station
        for ( int[] num : stations){

            int nextStation = num[0];
            int fuel = num[1];

//             exhausted all fuel before reaching first station
            while ( current < nextStation ){
//                 no fuel stations encountered
                if ( pq.isEmpty() ){

                    return -1;

                }
//                 fuel stations encountered (Refuel)
                int maxFuel = pq.poll();
                current += maxFuel;
                res++;
            }
//             max value of fuel till current
            pq.offer(fuel);
        }

        while ( current < target ){
//                 fuel got empty before reaching
            if ( pq.isEmpty() ){

                return -1;

            }
//                 fuel stations encountered (Refuel)
            int maxFuel = pq.poll();
            current += maxFuel;
            res++;
        }
        return res;
    }
}
