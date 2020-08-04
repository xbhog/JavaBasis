package day3;

import java.util.Random;
import java.util.Scanner;
/*
public class random {
    public static void main(String[] args) {
        Random ra = new Random();
        int num = ra.nextInt(10);
        System.out.println(num);
    }
}
/*
需求：
程序自动生成一个1-100之间的数字，使用程序实现猜出这个数字是多少？
*   当猜错的时候根据不同情况给出相应的提示
    A. 如果猜的数字比真实数字大，提示你猜的数据大了
    B. 如果猜的数字比真实数字小，提示你猜的数据小了
    C. 如果猜的数字与真实数字相等，提示恭喜你猜中了

*/

public class random{
    public static void main(String[] args) {
        Random ra = new Random();
        int numra = ra.nextInt(10);
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("输入数字：");
            int num = sc.nextInt();
            if (num > numra) {
                System.out.println("猜大了");

            } else if (num < numra) {
                System.out.println("猜小了");

            } else {
                System.out.println("猜对了");
                break;
            }
        }
    }
}
