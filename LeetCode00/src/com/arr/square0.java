package com.arr;

public class square0 {
    public static void main(String[]args){
        //这是之前自己写错的代码，因为输出的是数组的地址而不是数组
//        int[]nums={-4,-1,0,3,10};
//        Solution b=new Solution();
//       int[]result=b.sortedSquares(nums);
//        System.out.println(result);
        //下面是修改过的
        Solution sol = new Solution();
        int[] nums = new int[]{-4,-1,0,3,10};
        //这个int[]arr和result是一致的
        int[] result = sol.sortedSquares(nums);
        //result是数组名，你要输出的是数组中的元素
        for (int i = 0; i < result.length; i++) System.out.print(result[i] + ", ");
    }

}
//陈说先按照题解抄一遍，一边抄一边自己想思路，一遍下来以后如果还有问题，那再开始第二遍
//也是自己的经验
class Solution{
    public int[] sortedSquares(int[]nums){ //这个方法看起来是个数组，所以写成这种形式
        int right=nums.length-1;
        int left=0; //因为是两个指针，还是定义左右，最左边的是0，最右边的是数组长度-1；
        int[]result=new int[nums.length];
        int index=result.length-1;
        while(left<=right){
            if(nums[left]*nums[left]>nums[right]*nums[right]){
                //如果是左边的大，左边的指针就要右移
                result[index--]=nums[left]*nums[left];
                //这句没看懂啥意思
                ++left;
            }else{
                result[index--]=nums[right]*nums[right];
                --right;
                //右边的向左移，所以是减减
            }
        }
        return result;
    }
}
