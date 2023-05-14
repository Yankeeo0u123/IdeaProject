package com.arr_;

public class dichotomy1 {
    public static void main(String[]args){
        int[]nums = {1,0,3,5,9,12};
        int target=9;
        Solution1 solution1=new Solution1();
        solution1.search()
        System.out.println(target]);
    }
}
class Solution1{
    public int search(int[]nums,int target){
        int left=0;
        int right=nums.length-1;
        int mid=left+right>>2;
        if(target<nums[0]||target>nums[nums.length-1]){
            return -1;
        } else if (nums[mid]<target) {
            left=mid+1;
        }else if(nums[mid]<target){
            right=mid-1;
        }
        return target;
    }
}
