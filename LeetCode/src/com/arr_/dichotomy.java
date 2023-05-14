package com.arr_;

public class dichotomy {
    public static void main(String[]args){
        int[]nums= {-1, 0, 3, 5, 9, 12};
        int target=9;
        System.out.println(nums[target]);
    }
}
class Solution{
    public int Search(int[]nums,int target){
        //左闭右闭
        if(target<nums[0]||target>=nums[nums.length-1]){
            return -1;
        }
        int left=0;
        int right=nums.length-1;
        int mid=left+(right-left)>>1;
        while(target==mid){
            return nums[mid];
        }if(target<nums[mid]){
            right=mid-1;
        } else if (target>nums[mid]){
            left=mid+1;
        }
        return target;
    }
}