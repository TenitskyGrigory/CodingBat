package Array_1;

public class MakeEnds {
    public int[] makeEnds(int[] nums) {
        int[] newarray = new int[] {nums[0], nums[nums.length-1]};
        return newarray;
    }
}
