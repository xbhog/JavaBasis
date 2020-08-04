package day3;

//for循环中语句中
//需求1：在控制台输出1-5和5-1的数据
/*public class forCycle {
    public static void main(String[] args) {
        //输出1-5
        for (int i=1;i<=5;i++){
            System.out.println(i);
        }
        System.out.println("------------");
        for (int i=5;i>=1;i--){
            System.out.println(i);
        }

    }
}
*/

//需求2：求1-5之间的数据和，并把求和结果在控制台输出
/*
public class forCycle{
    public static void main(String[] args) {
        //求和的最终结果必须保存起来，需要定义一个变量，用于保存求和的结果，初始值为0
        int sum = 0;
        for (int i=1;i<=5;i++){
            sum += i;
            /* sum += i; sum = sum + i;
            第一次：sum = sum + i = 0 + 1 = 1;
            第二次：sum = sum + i = 1 + 2 = 3;
            第三次：sum = sum + i = 3 + 3 = 6;
            第四次：sum = sum + i = 6 + 4 = 10;
            第五次：sum = sum + i = 10 + 5 = 15;
            */
        /*}
        System.out.println(sum);
    }
}
*/

//需求3：求1-100之间的偶数和，并把求和结果在控制台输出
/*public class forCycle{
    public static void main(String[] args) {
        int sum = 0;
        for (int i=1;i<=100;i++){
            //对1-100的偶数求和，需要对求和操作添加限制条件，判断是否是偶数
            if(i % 2 == 0){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
*/

/*需求4：在控制台输出所有的“水仙花数”
    解释：什么是水仙花数？
    水仙花数，指的是一个三位数，个位、十位、百位的数字立方和等于原数
    例如 153 3*3*3 + 5*5*5 + 1*1*1 = 153
思路：
    1. 获取所有的三位数，准备进行筛选，最小的三位数为100，最大的三位数为999，使用for循环获取
    2. 获取每一个三位数的个位，十位，百位，做if语句判断是否是水仙花数
*/
public class forCycle {
    public static void main(String[] args) {
        int count=0;
        for (int i = 100; i < 1000; i++) {
            int bits = i % 10;
            int ten = i /10 % 10;
            int hundredBit = i / 10 / 10 % 10;
            if (bits * bits * bits + ten * ten * ten + hundredBit * hundredBit * hundredBit == i) {
                System.out.println(i + ":是水仙花");
                count ++;
            }
        }
        System.out.println("水仙花的个数是："+count);
    }
}
