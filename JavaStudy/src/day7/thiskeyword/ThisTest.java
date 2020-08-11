package day7.thiskeyword;

public class ThisTest {
    public static void main(String[] args) {
        //创建对象
        Thisdemo th = new Thisdemo();
        th.setName("xbhog");

        Thisdemo th1 = new Thisdemo();
        th1.setName("xbhogdemo");
    }

}

/*
* 封装思想【理解】
1. 封装概述 是面向对象三大特征之一（封装，继承，多态） 是面向对象编程语言对客观世界的模拟，客观世界里成员变量都是隐藏在对象内部的，外界是无法直接操作的
2. 封装原则 将类的某些信息隐藏在类内部，不允许外部程序直接访问，而是通过该类提供的方法来实现对隐藏信息的操作和访问 成员变量private，提供对应的getXxx()/setXxx()方法
3. 封装好处 通过方法来控制成员变量的操作，提高了代码的安全性 把代码用方法进行封装，提高了代码的复用性

* */