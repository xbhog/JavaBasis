package day2;
//关系运算符--三元运算符
public class Relationship {
    public static void main(String[] args) {
        //关系运算符的结果都是boolean类型，要么是true，要么是false。
        int a = 10;
        int b = 20;
//         System.out.println(a == b);
//         System.out.println("----------");
//         System.out.println(a != b);
//         System.out.println("----------");
//         System.out.println(a > b);
//         System.out.println("----------");
//         System.out.println(a >= b);
//         System.out.println("----------");
//         System.out.println(a < b);
//         System.out.println("----------");
//         System.out.println(a <= b);

         //boolean flag = a < b;
         //System.out.println(flag);
         //System.out.println("------1.5逻辑运算符-----------");
         //1.5逻辑运算符--判断的结果是 true 或 false。
        /*
        *   符号 作用 说明
            & 逻辑与 a&b，a和b都是true，结果为true，否则为false
            | 逻辑或 a|b，a和b都是false，结果为false，否则为true
            ^ 逻辑异或 a^b，a和b结果不同为true，相同为false
            ! 逻辑非 !a，结果和a的结果正好相反
        *
        * */

        int i = 10;
        int j = 20;
        int k = 30;

        //& “与”，并且的关系，只要表达式中有一个值为false，结果即为false
        //System.out.println((i > j) & (i > k));
        //System.out.println((i < j) & (i > k));

        //| “或”，或者的关系，只要表达式中有一个值为true，结果即为true
        //System.out.println((i > j) | (i > k));
        //System.out.println((i < j) | (i > k));

        //^ “异或”，相同为false，不同为true
        //System.out.println((i < j) ^ (i > k));
        //System.out.println((i > j) ^ (i > k));

        //! “非”，取反
        //System.out.println((i > j));
        //System.out.println(!(i > j));

        System.out.println("-------短路逻辑运算符------");

        /*
        *   逻辑与&，无论左边真假，右边都要执行。
            短路与&&，如果左边为真，右边执行；如果左边为假，右边不执行。
            逻辑或|，无论左边真假，右边都要执行。
            短路或||，如果左边为假，右边执行；如果左边为真，右边不执行。
        * */

        int x = 3;
        int y = 4;

        //System.out.println((x++ >4) & (y++ > 5));
        System.out.println(x); //4
        System.out.println(y); //5

        //System.out.println((x++ >4) && (y++ > 5));
        System.out.println(x); //4
        System.out.println(y); //4

        System.out.println("----------- 三元运算符--------");
        //语法格式：关系表达式 ? 表达式1 : 表达式
        int m = 10;
        int n = 20;
        // 判断 a>b 是否为真，如果为真取a的值，如果为假，取b的值
//        int mn = m > n ? m: n;
//        System.out.println(mn);

        //案例：
        /*
        *1. 需求：动物园里有两只老虎，已知两只老虎的体重分别为180kg、200kg，
        * 请用程序实现判断两只老虎的体重是否相同。
        *
        * 2.需求：一座寺庙里住着三个和尚，已知他们的身高分别为150cm、210cm、165cm，
        * 请用程序实现获取这三个和尚的最高身高。
        * */

        int tager1 = 180;
        int tager2 = 200;
        //boolean tager = tager1 == tager2 ? true:false;
        //System.out.println("tager:" +tager);

        int height1 = 150;
        int height2 = 210;
        int height3 = 165;

        //int height = height1 > height2 ? height1:(height2>height3 ? height2:height3);
        //System.out.println("maxheight:" +height);
        System.out.println("demo");





    }
}
