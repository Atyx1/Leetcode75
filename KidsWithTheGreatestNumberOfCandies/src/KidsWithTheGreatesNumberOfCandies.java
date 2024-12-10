import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatesNumberOfCandies {

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> booleanList = new ArrayList<>();
         int max=candies[0];

        for (int candy : candies) {
            max = Math.max(max, candy);
        }

        for (int i=0;i<candies.length;i++){
             if (candies[i]+extraCandies>=max){
                 booleanList.add(true);
             }
             else {
                 booleanList.add(false);
             }
        }
        return booleanList;
    }


}