import Leetcode.Array;

public class Main {
    public static void main(String[] args) {
        Array array = new Array();

        int[] nums = {2,7,11,15};
        int target = 9;
        int[] result = array.twoSum(nums, target);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}