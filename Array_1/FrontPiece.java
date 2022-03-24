package Array_1;

public class FrontPiece {
    public int[] frontPiece(int[] nums) {
        if(nums.length < 2) {
            return nums;
        }
        else {
            int[] newarray = new int[] {nums[0], nums[1]};
            return newarray;
        }
    }
}
