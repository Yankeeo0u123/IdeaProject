package com.arr;
//输入：nums = [3,2,2,3], val = 3
//        输出：2, nums = [2,2]
//        解释：函数应该返回新的长度 2, 并且 nums 中的前两个元素均为 2。
//        你不需要考虑数组中超出新长度后面的元素。例如，函数返回的新长度为 2 ，
//        而 nums = [2,2,3,3] 或 nums = [2,2,0,0]，也会被视作正确答案。
public class Remove02 {
    public static void main(String[] args) {
        int[]nums={3,2,2,3};
        int val=3;
        Solution1 a=new Solution1();
        int result=a.removeElement(nums,val);
        System.out.println(result);

    }
}

//class Remove{
//    public static int RemoveElement(int[]nums,int val){ //参数的值是别人给好的，那你当然要定义一下
//                                   //这个int[]nums的中括号可不能少写
//        int slowIndex=0;
//        for(int fastIndex=0;fastIndex<nums.length;fastIndex++){
//                if(nums[fastIndex]!=val){
//                    slowIndex=fastIndex;
//                }
//                slowIndex++;
//            }
//        return slowIndex;
//    }
//}
class Solution1{
    public static int removeElement(int[]nums,int val){
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
