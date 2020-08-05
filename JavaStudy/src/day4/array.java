package day4;
//数组
/*
public class array {
    public static void main(String[] args) {
        //数组是存储数据长度固定的容器，存储多个数据的数据类型要一致
        //数据类型[] 数组名
        int[] arr;
        double[] arr1;
        char[] arr2;

        //数据类型 数组名[]
        int arr11[];
        double arr12[];
        char arr13[];

        //数组动态初始化
        //定义：数组动态初始化就是只给定数组的长度，由系统给出默认初始化的值
        //格式：数据类型[] 数组名 = new 数据类型[数组长度]
        int[] arrd = new int[3];



    }
}
*/
//数组元素访问
/*
public class array{
    public static void main(String[] args) {
        //给int数组赋值
        //int[] arr = new int[]{1,2,3};
        int[] arr = new int[3];
        //输出数组名
        System.out.println(arr);

        //输出数组中的元素
        //没有给int数组赋值的话默认是0
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }
}
*/
/*内存分配
    目前我们只需要记住两个内存，分别是：栈内存和堆内存
    方法区 存储可以运行的class文件。
    堆内存 存储对象或者数组，new来创建的，都存储在堆内存。（实体，对象），使用完毕在垃圾回收器空闲的时候被回收
    栈内存 存储局部变量，定义方法中的变量，使用完毕，立即消失
    方法栈 方法运行时使用的内存，比如main方法运行，进入方法栈中执行。

数组在初始化的时候，会为存储空间添加默认值
1. 整数：默认值0
2. 浮点数：默认值0.0
3. 布尔值：默认值false
4. 字符：默认值是空字符
5. 引用数据类型：默认值是null

* */


//数组的静态初始化
/*
* 完整版格式
    数据类型[] 数组名 = new 数据类型[]{元素1,元素2,...};
* 简化版格式
*   数据类型[] 数组名 = {元素1,元素2,...};
* */

/*
public  class array{
    public static void main(String[] args) {
        int[] arr = {1,2,3};

        System.out.println(arr);

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }
}
*/
//数组操作的两个常见小问题
/*
* 1. 索引越界异常
*   数组长度为3，索引范围是0~2，但是我们却访问了一个3的索引。
    程序运行后，将会抛出ArrayIndexOutOfBoundsException 数组越界异常。在开发中，数组的越界异常是不
    能出现的，一旦出现了，就必须要修改我们编写的代码。
    解决方案：
    将错误的索引修改为正确的索引范围即可
* 2. 空指针异常
*   arr = null 这行代码，意味着变量arr将不会在保存数组的内存地址，也就不允许再操作数组了，因此运行的时
    候会抛出 NullPointerException 空指针异常。在开发中，数组的越界异常是不能出现的，一旦出现了，就必
    须要修改我们编写的代码。
    解决方案：
    给数组一个真正的堆内存空间引用即可
    *
    *
    * public class ArrayDemo {
    *   public static void main(String[] args) {
    *   int[] arr = new int[3];
    *   //把null赋值给数组 arr = null;
    *   System.out.println(arr[0]);
    *   }
    * }
* */
//多个数组只想相同的内存图
/*public class array{
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 100;
        arr[1] = 200;
        arr[2] = 300;
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println("----------------------");
        //arr内存地址指向arr2
        int[] arr2 = arr;
        arr2[0] = 111;
        arr2[1] = 211;
        arr2[2] = 333;
        System.out.println(arr2);
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);
        System.out.println("-------------");
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }
}
*/
//数组遍历
//数组遍历：就是将数组中的每个元素分别获取出来，就是遍历。遍历也是数组操作中的基石。
/*
public class array{
    public static void main(String[] args) {
        int[] arry = {1,2,3,4,5,6,7};
        for (int x = 0;x<arry.length;x++){
            System.out.println(arry[x]);
        }
    }
}
*/
//数组最值
//最大值获取：从数组的所有元素中找出最大值

/*public class array{
    public static void main(String[] args) {
        int[] arr = {1,2,66,13,55};
        //定义一个变量，用于保存最大值 //取数组中第一个数据作为变量的初始值
        int max = arr[0];
        //与数组中剩余的数据逐个比对，每次比对将最大值保存到变量中
        for (int x=1;x<arr.length;x++){
            if(arr[x]>max){
                max = arr[x];
            }
        }
        System.out.println("最大值是："+max);
    }
}

 */

/*
public class array{
    public static void main(String[] args) {
        int[] arr = new int[3];
        int[] arr1 = new int[4];
        System.out.println(arr);
        System.out.println(arr1);
    }
}

 */