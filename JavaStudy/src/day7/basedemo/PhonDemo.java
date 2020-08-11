package day7.basedemo;

import day7.basedemo.objectOriented;

//面向兑现基础了解
public class PhonDemo {
    public static void main(String[] args) {
        //创建对象
        objectOriented p = new objectOriented();

        //使用成员变量
        System.out.println(p.brand);
        System.out.println(p.price);

        p.brand = "小米";
        p.price = 2999;

        System.out.println(p.brand);
        System.out.println(p.price);

        //使用成员方法
        p.call();
        p.semdMessage();
    }
}
/*
* 成员变量和局部变量：
*   成员变量：在类中方法之外定义的-----（随着对象的存在而存在，随着对象的消失而消失）
*   局部变量：在类中定义的 -----（随着方法的调用而存在，随着方法的调用完毕而消失）
* */
