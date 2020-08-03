package day2.demo;

import javax.swing.*;
import java.util.Scanner;

public class Process_control {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//
//        if (a > b){
//            System.out.println("a的值大于b");
//        }else {
//            System.out.println("a的值小于b");
//        }

        //案例1：
        /*
        *   需求：任意给出一个整数，请用程序实现判断该整数是奇数还是偶数，并在控制台输出该整数是奇数还是偶数。
            分析：
            ①为了体现任意给出一个整数，采用键盘录入一个数据
            ②判断整数是偶数还是奇数要分两种情况进行判断，使用if..else结构
            ③判断是否偶数需要使用取余运算符实现该功能 number % 2 == 0
            ④根据判定情况，在控制台输出对应的内容
        * */
        //创建对象
//        Scanner sc = new Scanner(System.in);
//        //传递数据
//        System.out.println("输入整型：");
//        int number = sc.nextInt();
//
//        if (number % 2 == 0){
//            System.out.println("该数字是偶数");
//        }else {
//            System.out.println("该数字是奇数");
//        }

        //案例2：
        /*
        *
            需求：小明快要期末考试了，小明爸爸对他说，会根据他不同的考试成绩，送他不同的礼物，假如你可以控制小明
            的得分，请用程序实现小明到底该获得什么样的礼物，并在控制台输出。
            分析：
            ①小明的考试成绩未知，可以使用键盘录入的方式获取值
            ②由于奖励种类较多，属于多种判断，采用if...else...if格式实现
            ③为每种判断设置对应的条件
            ④为每种判断设置对应的奖励
            ⑤数据测试：正确数据，边界数据，错误数据
        * */
        //小明的考试成绩未知，可以使用键盘录入的方式获取值

        Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个分数：");
        int score = sc.nextInt();
//        由于奖励种类较多，属于多种判断，采用if...else...if格式实现
        //为每种判断设置对应的条件
        //为每种判断设置对应的奖励
        //数据测试：正确数据，边界数据，错误数据
//        if(score>100 || score<0) {
//            System.out.println("你输入的分数有误");
//        } else if(score>=95 && score<=100) {
//            System.out.println("山地自行车一辆");
//        } else if(score>=90 && score<=94) {
//            System.out.println("游乐场玩一次");
//        } else if(score>=80 && score<=89) {
//            System.out.println("变形金刚玩具一个");
//        } else {
//            System.out.println("胖揍一顿");
//            System.out.println("不学习");
//        }
        System.out.println("demo");



    }
}
