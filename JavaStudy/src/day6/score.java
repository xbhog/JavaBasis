package day6;

/*打分
在编程竞赛中，有6个评委为参赛的选手打分，分数为0-100的整数分。 选手的最后得分为：去掉一个最高分和一
个最低分后 的4个评委平均值 (不考虑小数部分)


思路：
    1:定义一个数组，用动态初始化完成数组元素的初始化，长度为6
    2:键盘录入评委分数
    3:由于是6个评委打分，所以，接收评委分数的操作，用循环改进
    4:定义方法实现获取数组中的最高分(数组最大值)，调用方法
    5:定义方法实现获取数组中的最低分(数组最小值) ，调用方法
    6:定义方法实现获取数组中的所有元素的和(数组元素求和) ，调用方法
    7:按照计算规则进行计算得到平均分 8:输出平均分
* */
/*import java.util.Scanner;
public class score {
    public static void main(String[] args) {
        //定义一个数组,用动态初始化完成数组元素的初始化，长度为6
        int[] arr = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int x=0;x<arr.length;x++){
            System.out.print("输入第"+x+"数：");
            arr[x] = sc.nextInt();
        }
        //定义方法实现获取数组中的最高分(数组最大值)，调用方法
        int max = getmax(arr);
        System.out.println(max);
        //定义方法实现获取数组中的最低分(数组最小值) ，调用方法
        int min = getmin(arr);
        System.out.println(min);
        //定义方法实现获取数组中的所有元素的和(数组元素求和) ，调用方法
        int sum = getnum(arr);
        System.out.println(sum);
        //按照计算规则进行计算得到平均分
        int average = (sum-max-min)/(arr.length-2);
        System.out.println("平均分"+average);

    }

    public static int getmax(int[] arr){
        int maxnum = arr[0];
        for(int x=1;x<arr.length;x++){
            if(arr[x]>maxnum){
                maxnum = arr[x];
            }
        }return maxnum;
    }
    public static int getmin(int[] arr){
        int minnum = arr[0];
        for (int x=1;x<arr.length;x++){
            if (arr[x]<minnum){
                minnum =arr[x];
            }
        }return minnum;

    }
    public static int getnum(int[] arr){
        int number = 0;
        for (int x=0;x< arr.length;x++){
            number +=arr[x];
        }
        return number;

    }
}*/
