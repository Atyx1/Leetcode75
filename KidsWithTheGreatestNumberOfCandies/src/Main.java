import java.util.List;

public class Main {
    public static void main(String[] args) {

        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;

        List<Boolean> result =  KidsWithTheGreatesNumberOfCandies.kidsWithCandies(candies,extraCandies);

        System.out.println("Result: " + result);


    }
}
