package Array_1;

public class SwapEnds {
    public int[] swapEnds(int[] nums) {
        int front = nums[nums.length-1];
        int end = nums[0];
        nums[0] = front;
        nums[nums.length-1] = end;
        return nums;
    }
}
