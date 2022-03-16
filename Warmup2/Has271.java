package CodingBat.Warmup2;

public class Has271 {
    public boolean has271(int[] nums) {
        if(nums.length < 3)
            return false;
        for(int i = 0; i < nums.length - 2; i++) {
            int a = nums[i];
            if((nums[i] + 5 == nums[i+1]) && Math.abs(nums[i + 2] - (a - 1)) <= 2){
                return true;
            }
        }
        return false;
    }
}
