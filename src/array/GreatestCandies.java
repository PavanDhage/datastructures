package array;

import java.util.ArrayList;
import java.util.List;

public class GreatestCandies {
    static void main() {
        int[] candies = {2,4,7,3,8};
        int extra_candies = 4;
        List<Boolean> list = new ArrayList<>() ;
        int max = 0;
        for(int i=0;i<candies.length;i++){
            if(max<candies[i])
                max = candies[i];
        }
        for(int i = 0; i<candies.length;i++){
            if(candies[i]+ extra_candies >= max){
                list.add(true);
            }
            else
                list.add(false);
        }

        System.out.println(list);

    }
}
