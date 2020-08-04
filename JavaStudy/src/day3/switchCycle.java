package day3;

import  java.util.Scanner;
/*
* 需求：一年有12个月，分属于春夏秋冬4个季节，键盘录入一个月份，请用程序实现判断该月份属于哪个季
节，并输出。
* */

//如果switch中得case，没有对应break的话，则会出现case穿透的现象。
//case：-----后面接冒号
public class switchCycle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //接收数据
        System.out.println("请输入月份信息：");
        int month = sc.nextInt();
        switch (month){
            case 1:
            case 2:
            case 12:
                System.out.println("冬季");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;

            default:
                System.out.println("您输入的数据有问题！");
                break;
        }

    }
}
