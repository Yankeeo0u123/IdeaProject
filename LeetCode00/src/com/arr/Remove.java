package com.arr;
public class Remove {
    public static void main(String arg[]){
        int[] nums={3,2,2,3};
        int val=3;
        System.out.println(removeElement(nums, val));
    }
    public  static int removeElement(int nums[],int val){
        //快慢指针
        int slowIndex=0;
        for(int fastIndex=0;fastIndex<nums.length;fastIndex++){
            if(nums[fastIndex]!=val){
                nums[slowIndex]=nums[fastIndex];
                slowIndex++;
            }
        }
        return slowIndex;
    }
}
