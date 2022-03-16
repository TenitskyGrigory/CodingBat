package CodingBat.Warmup2;

public class NoTriples {
    public boolean noTriples(int[] nums) {
        if(nums.length < 3)
            return true;
        int x = 0;
        for(int i = 0; i < (nums.length-1); i++) {
            x = nums[i];
            if(nums[i] == x && nums[i+1] == x && nums[i+2] == x)
                return false;
        }
        return true;
    }
}
