package com.arr;
public class Arrays {
            public static void main(String[] args) {
                int[] nums = new int[]{-1, 0, 3, 5, 9, 12};
                int target = 9;
                Arrays arrays = new Arrays();
                int result = arrays.search(nums, target);
                System.out.println(result);
            }

    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while(left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            }

            if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            }
        }

        return -1;
    }
}