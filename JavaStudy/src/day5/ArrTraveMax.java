package day5;

import java.util.Arrays;

//数组遍历以及最大值
/*
*需求：设计一个方法用于数组遍历，要求遍历的结果是在一行上的。例如：[11, 22, 33, 44, 55]
    思路：
        ①因为要求结果在一行上输出，所以这里需要在学习一个新的输出语句System.out.print(“内容”);
            System.out.println(“内容”); 输出内容并换行
            System.out.print(“内容”); 输出内容不换行
            System.out.println(); 起到换行的作用
        ②定义一个数组，用静态初始化完成数组元素初始化
        ③定义一个方法，用数组遍历通用格式对数组进行遍历
        ④用新的输出语句修改遍历操作
        ⑤调用遍历方法
* */
/*public class ArrTraveMax {
    public static void main(String[] args) {

        int[] arr = {10,20,30,45};
        list(arr);
    }

    public static void list(int[] arr){
        System.out.println(arr.length);
        for(int x=0;x < arr.length;x++){
                if(x == arr.length-1){
                    System.out.print(arr[x]);
                }
                else {
                    System.out.print(arr[x]+", ");

                }
        }

    }
}

 */
/*
* 需求：设计一个方法用于获取数组中元素的最大值
    思路：
        ①定义一个数组，用静态初始化完成数组元素初始化
        ②定义一个方法，用来获取数组中的最大值，最值的认知和讲解我们在数组中已经讲解过了
        ③调用获取最大值方法，用变量接收返回结果
        ④把结果输出在控制台
* */

public class ArrTraveMax{
    public static void main(String[] args) {
        int[] array = {12,32,56,98,10};
        int flag = getmax(array);
        System.out.println("最大值："+flag);
    }

    public static int getmax(int[] array) {
        int max = array[0];
        for (int x = 1;x<array.length;x++){
            if (max<array[x]){
                max = array[x];
            }
        }
        return max;
    }
}