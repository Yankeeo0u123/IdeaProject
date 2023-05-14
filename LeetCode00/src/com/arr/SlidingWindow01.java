//package com.arr;
//
//public class SlidingWindow01 {
//    public static void main(String[]args){
//        int[]nums={2,3,1,2,4,3};
//        int target=7;
//        Solution02 sol=new Solution02();
//        System.out.println(sol.minSubArrayLen(nums,7));
//    }
//}
//class Solution02{
//    public int minSubArrayLen(int[]nums,int target){
//        int left=0;
//        //左边指针等于0
//        int result=Integer.MAX_VALUE;//必须定义是最大值
//        int sum=0;
//        //窗口开始向右动
//        for(int right=0;right<nums.length;right++){
//            //sum是右边指针遍历过的所有加和
//            sum+=nums[right];
//            //当到达这个临界条件，左边指针开始遍历
//            while(sum>=target){
//                result=Math.min(result,right-left+1);
//                sum-=nums[left];
//                //此时左边开始动了yichu
//            }
//        }
//        return result==Integer.MAX_VALUE?0:result;
//    }
//}
