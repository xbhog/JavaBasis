package day6;
/*需求1：
    * 输入星期数，显示今天的减肥活动 周一：跑步 周二：游泳 周三：慢走 周四：动感单车 周五：拳击 周六：爬山
    周日：好好吃一顿
* */
import java.util.Scanner;

/*public class practice {
    public static void main(String[] args) {
        //不换行输入
        System.out.print("请输入星期数：");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num == 1){
            System.out.println("周一跑步");
        }
        else if(num == 2){
            System.out.println("周二游泳");
        }
        else  if(num == 3){
            System.out.println("周三慢走");
        }

        else if(num==4){
            System.out.println("周四骑动感单车");
        }
        else if (num==5){
            System.out.println("周五拳击");
        }
        else if(num==6){
            System.out.println("周六爬山");
        }
        else if(num==7){
            System.out.println("周日吃一顿");
        }
        else{
            System.out.println("数据有错误！");
        }


    }
}

*/
//需求2
//switch版本
/*public class practice{
    public static void main(String[] args) {
        System.out.print("请输入星期数：");
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();

        switch (data){
            case 1:
                System.out.println("周一跑步");
                break;
            case 2:
                System.out.println("周二游泳");
                break;
            case 3:
                System.out.println("周三慢走");
                break;
            case 4:
                System.out.println("周四骑动感单车");
                break;
            case 5:
                System.out.println("周五拳击");
                break;
            case 6:
                System.out.println("周六爬山");
                break;
            case 7:
                System.out.println("周日吃一顿");
                break;
            default:
                System.out.println("数据输入有问题！");
                break;
        }

    }
}
 */
/*
*逢七跳过：
    * 案例需求3：
        朋友聚会的时候可能会玩一个游戏：逢七过。
        规则是：
            从任意一个数字开始报数，当你要报的数字包含7或者是7的倍数时都要说：过。
            为了帮助大家更好的玩这个游戏，这里我们直接在控制台打印出1-100之间的满足逢七必过
            规则的数据。 这样，大家将来在玩游戏的时候，就知道哪些数据要说：过
    */
/*public class practice{
    public static void main(String[] args) {
        int number = 100;
        for (int x=1;x<= number;x++){
            //根据规则，用if语句实现数据的判断：要么个位是7，要么十位是7，要么能够被7整除
            if(x%10==7 || x/10%10==7 || x%7==0){
                System.out.println(x+"-----过");
            }
        }
    }
}
 */

//需求四
/*
不死神兔：
* 有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子， 假如兔子都
    不死，问第二十个月的兔子对数为多少
* */
//public class practice{-----错误的---------
//    public static void main(String[] args) {
//        int rabbit = 1;
//        for(int x=1;x<=20;x+=3){
//            rabbit +=x;
//        }
//        System.out.println("20个月后兔子的对数是："+rabbit);
//    }
//}

//没有理解
/*public class practice {
    public static void main(String[] args) {

        //为了存储多个月的兔子对数，定义一个数组，用动态初始化完成数组元素的初始化，长度为20
        int[] arr = new int[20];
        //因为第1个月，第2个月兔子的对数是已知的，都是1，所以数组的第1个元素，第2个元素值也都是1
        arr[0] = 1;
        arr[1] = 1;
        //用循环实现计算每个月的兔子对数
        //使用debug--明确过程
        for(int x=2; x<arr.length; x++){
            arr[x] = arr[x-2] + arr[x-1];
            System.out.println(arr[x]);
        }
        //输出数组中最后一个元素的值，就是第20个月的兔子对数
        System.out.println("第二十个月兔子的对数是：" + arr[19]);
    }
}
 */


//需求五---百钱百鸡
/*
* 我国古代数学家张丘建在《算经》一书中提出的数学问题：鸡翁一值钱五，鸡母一值钱三，鸡雏三值钱一。 百钱
买百鸡，问鸡翁、鸡母、鸡雏各几何？
* x+y+z=100
* 5x+3y+3/z=100
* 自己算一下
*
*
* 思路：
    * 1:第1层循环，用于表示鸡翁的范围，初始化表达式的变量定义为 x=0，判断条件是x<=20
    * 2:第2层循环，用于表示鸡母的范围，初始化表达式的变量定义为 y=0，判断条件是y<=33
    * 3:这个时候，用于表示鸡雏的变量 z = 100 – x – y
    * 4:判断表达式 z%3==0 和表达式 5*x + 3*y + z/3 = 100 是否同时成立，如果成立，输出对应的 x，y，z 的值，就是对应的鸡翁，鸡母，鸡雏的值
* */
public class practice{
    public static void main(String[] args){
        for(int x=0;x<=20;x++){
            for(int y=0;y<=33;y++){
                int z = 100 -x -y;
                if (z%3==0 && 5*x+3*y+3/z==100){
                    System.out.println(x+","+y+","+z);                }
            }
        }
    }
}