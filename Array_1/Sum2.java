package Array_1;

public class Sum2 {
    public int sum2(int[] nums) {
        if (nums.length < 1) {
            return 0;
        }
        else if(nums.length < 2) {
            return nums[0];
        }
        int sum = nums[0] + nums[1];
        return sum;
    }
}
