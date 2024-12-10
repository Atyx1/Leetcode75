public class Main {
    public static void main(String[] args) {

        int dizi[] = new int[]{-2,10,6,7,-7,2};
        System.out.println(findMaxK(dizi));


    }



    public static int findMaxK(int[] nums) {
        int max=nums[0];
        for(int i=1;i< nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
            }
        }
        for(int i=0;i< nums.length;i++){
            if(max==-(nums[i])){
                return max;
            }
        }

        return -1;
    }

}