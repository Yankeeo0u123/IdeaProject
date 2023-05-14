package com.atguigu.sparsearray;

public class SparseArray {
    public static void main(String[] args){
        //先创建一个二维数组
        int chessArr1[][]=new int[11][11];
        //赋值
        chessArr1[1][2]=1;
        chessArr1[2][4]=2;
        //遍历 两层for循环嵌套输出这个数组
        for(int[] row:chessArr1){
            for(int data:row){
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }
//之后将二维数组转化成稀疏数组，首先计算一下有多少非0元素
        int sum=0;
        //i代表行元素，遍历每一行
        for(int i=0;i<11;i++){
            for(int j=0;j<11;j++){
                if(chessArr1[i][j]!=0){
                    sum++;
                }
            }
        }
        //创建对应的稀疏数组
        int sparseArr[][]=new int[sum+1][3];
        //给稀疏数组赋值,这是第一行的
        sparseArr[0][0]=11;
        sparseArr[0][1]=11;
        sparseArr[0][2]=sum;
        //遍历二维数组，把非0值存放到稀疏数组中
        int count=0;//用于记录这是第几个非0 数据
        for(int i=0;i<11;i++){
            for(int j=0;j<11;j++){
                if(chessArr1[i][j]!=0){
                    count++;
                    sparseArr[count][0]=i;
                    sparseArr[count][1]=j;
                    sparseArr[count][2]=chessArr1[i][j];
                }
            }
        }
        System.out.println();
        System.out.println("得到稀疏数组为～～～～");
        for(int i=0;i< sparseArr.length;i++){
            System.out.printf("%d\t%d\t%d\t\n",sparseArr[i][0],sparseArr[i][1],sparseArr[i][2]);
        }
        System.out.println();
        //将稀疏数组恢   复成原始数组
        int chessArr2[][]=new int[sparseArr[0][0]][sparseArr[0][1]];
        //输出恢复后的二维数组
        System.out.println();
        System.out.println("恢复后的二维数组");
        for(int[]row:chessArr2){
            for(int data:row){
                System.out.printf("%d\t",data);
            }
        }

    }

}
