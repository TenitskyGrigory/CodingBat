package Warmup2;

public class ArrayCount9 {
    public int arrayCount9(int[] nums) {
        int a = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 9){
                a = a + 1;
            }
        }
        return a;
    }
}
