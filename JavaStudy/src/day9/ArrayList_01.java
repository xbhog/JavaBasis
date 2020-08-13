package day9;

import java.util.ArrayList;

/*什么是集合--ArrayList;数组列表，相当于python中的列表
提供一种存储空间可变的存储模型，存储的数据容量可以发生改变
ArrayList集合的特点
底层是数组实现的，长度可以变化
泛型的使用
用于约束集合中存储元素的数据类型
* */
public class ArrayList_01 {
    public static void main(String[] args) {
        //创建类型是字符串的集合
        ArrayList<String> array = new ArrayList<String>();

        //添加元素
        array.add("hello");
        array.add("world");
        array.add("java");

        //元素操作

        System.out.println(array.set(1,"python")); //输出为world,设置后内存中还保存的之前的内容
        System.out.println(array.get(1));   //输出python

        //通过下标获取元素
        System.out.println(array.get(0));
        System.out.println(array.get(1));
        System.out.println(array.get(2));
        //System.out.println(array.get(3)); //报错信息：Index 3 out of bounds for length 3，索引溢出

        //删除指定元素并返回是否成功的提示
        System.out.println(array.remove("hello"));

        //指定下标删除,无提示
        System.out.println(array.remove(1));
        System.out.println(array);

    }
}
