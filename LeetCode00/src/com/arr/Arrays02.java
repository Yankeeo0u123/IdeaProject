package com.arr;
//    输入: nums = [-1,0,3,5,9,12], target = 9
//    输出: 4
//    解释: 9 出现在 nums 中并且下标为 4
public class Arrays02 {
        public static void main(String[]args){
            int[]nums={-1,0,3,5,9,12};
            int target=9;
            com.arr.Array arrays=new com.arr.Array();
            int result=arrays.Research(nums,target);
            System.out.println(result);
        }
    }
    class Array{
        public int Research(int[]nums,int target){
            int left=0;
            int right=nums.length-1;
//           if(target<0||target>nums[nums.length-1]){      (不明白这个为什么要注释掉)
//                return -1;
            while(left<=right){
                int mid=left+((right-left)>>1);
                if(target==nums[mid]){
                    return mid;
                }else if(target>nums[mid]){
                    left=mid+1;
                } else if (target<nums[mid]) {
                    right=mid-1;
                }
            }
            return -1;
        }
    }

