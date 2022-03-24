package Array_1;

public class MakeLast {
    public int[] makeLast(int[] nums) {
        int arraylength = nums.length;
        int [] newarray = new int[arraylength*2];
        newarray[newarray.length-1] = nums[nums.length-1];
        return newarray;
    }
}
