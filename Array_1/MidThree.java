package Array_1;

public class MidThree {
    public int[] midThree(int[] nums) {
        int[] newarray = new int[] {nums[nums.length/2-1], nums[nums.length/2], nums[nums.length/2+1]};
        return newarray;
    }
}
