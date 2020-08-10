package day6;
/*
需求6：数组元素求和
* 有这样的一个数组，元素是{68,27,95,88,171,996,51,210}。求出该数组中满足要求的元素和， 要求是：求和的元
素个位和十位都不能是7，并且只能是偶数
*
*
* 思路：
    * 1:定义一个数组，用静态初始化完成数组元素的初始化
    * 2:定义一个求和变量，初始值是0
    * 3:遍历数组，获取到数组中的每一个元素
    * 4:判断该元素是否满足条件，如果满足条件就累加
    * 5:输出求和变量的值
* */
/*public class arraysum {
    public static void main(String[] args) {
        int[] arr ={68,27,95,88,171,996,51,210};
        int num=0;
        for(int x=0;x<arr.length;x++){
            if(arr[x] %10 !=7 && arr[x]/10%10 !=7 && arr[x]%2==0){
                num +=arr[x];
                System.out.println("第"+x+"次循环得数："+num);

            }
        }System.out.println("总和："+num);
    }
}
 */
/*
* 需求7：判断两个数组是否相同
* 定义一个方法，用于比较两个数组的内容是否相同
* */

/*public class arraysum{
    public static void main(String[] args) {
        int[] arr = {11,32,45,78};
        int[] arr2 = {11,32,45,78};

        boolean flag = compare(arr,arr2);
        System.out.println(flag);

    }

    public static boolean compare(int[] arr,int[] arr2){
        if(arr.length != arr2.length){
            return false;
        }
        for(int x=0;x< arr.length;x++){
            if(arr[x] != arr2[x]){
                return false;
            }
        }return true;
    }
}
 */

/*需求8：查找元素在数组中出现的索引位置
已知一个数组 arr = {19, 28, 37, 46, 50}; 键盘录入一个数据，查找该数据在数组中的索引。
并在控制台输出找到的索引值。如果没有查找到，则输出-1
* */
/*import java.util.Scanner;
public class arraysum{
    public static void main(String[] args) {
        System.out.print("输入一个数字：");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = {19, 28, 37, 46, 50,34,55,74,23};

        int number = getindex(num,arr);
        System.out.println(number);
    }

    public static int getindex(int num,int[] arr){
        for(int x=0;x<arr.length;x++){
            if(arr[x]==num){
                return x;
            }
        }return -1;

    }
}
 */
/*
* 需求9：数组元素反转
* 已知一个数组 arr = {19, 28, 37, 46, 50}; 用程序实现把数组中的元素值交换， 交换后的数组 arr = {50, 46, 37, 28,
19}; 并在控制台输出交换后的数组元素。
*
* 思路：
    * 1:定义一个数组，用静态初始化完成数组元素的初始化
    * 2:循环遍历数组，这一次初始化语句定义两个索引变量，判断条件是开始索引小于等于结束索引
    * 3:变量交换
    * 4:遍历数组
* */
public class arraysum{
    public static void main(String[] args) {
        int[] arr = {19, 28, 37, 46, 50};

        //调用反转
        reserver(arr);
        //遍历数组
        forarr(arr);
    }

    public static void reserver(int[] arr){
        for(int start=0,end=arr.length-1;start<=end; start++,end--){
            //变量交换--需要一个中间变量来实现
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

        }
    }

    public static void forarr(int[] arr){
        for(int x=0;x < arr.length;x++){
            //如果x==最后下标数，则输出最后下标所对应的
            if(x==arr.length-1){
                System.out.println(arr[x]);
            }else {
                System.out.println(arr[x]);
            }

        }

    }
}