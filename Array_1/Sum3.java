package Array_1;

public class Sum3 {
    public int sum3(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        return sum;
    }
}
