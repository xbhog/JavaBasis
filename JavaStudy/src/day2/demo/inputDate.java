package day2.demo;

//以通过 Scanner 类来获取用户的输入
//数据输入（应用）

import  java.util.Scanner;



public class inputDate {
    public static void main(String[] args) {
        System.out.println("------数据输入（应用）-----");
        System.out.println("请输入一个整形数字：");
        //创建对象
        Scanner sc =  new Scanner(System.in);
        //接受数据
        int x = sc.nextInt();
        System.out.println("x:"+x);

        //改写三个和尚示例:
        Scanner sc1 = new Scanner(System.in);
        //键盘录入三个身高分别赋值给三个变量。
        System.out.println("输入第一个和尚的身高数据：");
        int height1 = sc1.nextInt();
        System.out.println("输入第二个和尚的身高数据：");
        int height2 = sc1.nextInt();
        System.out.println("输入第三个和尚的身高数据：");
        int height3 = sc1.nextInt();

//        int height = height1 > height2 ? height1:(height2>height3 ? height2:height3);
        //System.out.println("身高最高的是:" +height);
        System.out.println("demo");


    }

}
