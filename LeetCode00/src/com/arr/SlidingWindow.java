//package com.arr;
//
//public class SlidingWindow {
//    public  static void main(String[]args){
//        int target=7;
//        int[]nums={2,3,1,2,4,3};
//        Solution01 sol01=new Solution01();
//        System.out.println(sol01.minSubArrayLen(7,nums));
//    }
//
//}
//class Solution01{
//    //滑动窗口
//    public int minSubArrayLen(int target,int[]nums){
//        int left=0;//滑动窗口左侧指针
//        int sum=0;
//        //这是我们最后要返回的实际长度值,先初始化一个最大的没因为这个最后是取小，所以不能一开始就定义最小值
//        int result=Integer.MAX_VALUE;
//        //遍历数组的过程中滑动窗口的右边的指针先开始动
//        for(int right=0;right<nums.length;right++){
//            sum+=nums[right];
//            //加和不符合条件了，左指针就要移动
//            //上面是如何遍历的过程
//            while(sum>=target){
//                //加和取符合条件的最小值
//                result=Math.min(result,right-left+1);
//                //sum是从0开始右指针遍历所有数的加和
//                sum-=nums[left++];
//                //nums是从0开始左指针遍历所有数的加和
//            }
//        }
//        return result==Ixnteger.MAX_VALUE?0:result;
//    }
//
//}