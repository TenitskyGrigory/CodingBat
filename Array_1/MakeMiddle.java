package Array_1;

public class MakeMiddle {
    public int[] makeMiddle(int[] nums) {
        int[] newarray = new int[] {nums[nums.length/2-1], nums[nums.length/2]};
        return newarray;
    }
}
