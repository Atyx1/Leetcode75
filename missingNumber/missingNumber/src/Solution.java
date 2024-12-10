public class Solution {

    public static int missingNumber(int[] nums) {

        int sum = 0;
        int n = nums.length;

        for (int nume : nums) {
            sum += nume;
        }
        return (n * (n + 1)) / 2 - sum;
    }


}
