package com.arr;

public class square02 {
    public static void main(String[]args){
        int[]nums={-4,-3,0,2,5};
        Arraysquare sol1=new Arraysquare();
        int[] result = sol1.Result(nums);
        //为啥这个数组要在main里定义，left和right怎么就定义一次
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }

    }
}
class Arraysquare{
    public int[]Result(int nums[] ) {
        int left=0;
        int right= nums.length-1;
    //如何定义一个数组等于另一个数组
        int[]result=new int[nums.length];
        int index=result.length-1;
        while(left<right){
            //哪边大，另一边动
                if(nums[left]*nums[left]<nums[right]*nums[right]){
                    //右边大，右边落下去
                result[index--]=nums[right]*nums[right];
                //右边左移，而且是先左移，再自用
                --right;
            } else {
                result[index--]=nums[left]*nums[left];
                ++left;
            }
        }
        return result;
    }
}

