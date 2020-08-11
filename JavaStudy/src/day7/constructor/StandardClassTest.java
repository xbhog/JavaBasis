package day7.constructor;

/*
* 创建对象并为其成员变量赋值的两种方式 :
*   1:无参构造方法创建对象后使用setXxx()赋值
*   2:使用带参构造方法直接创建带有属性值的对象
* */
public class StandardClassTest {
    public static void main(String[] args) {
        //无参构造方法创建对象后使用setXxx()赋值
        StandardClassDemo s = new StandardClassDemo();
        s.setName("xbhog");
        s.setAge(18);
        s.show();

        //使用带参构造方法直接创建带有属性值的对象
        StandardClassDemo s1 = new StandardClassDemo("xbhog",23);
        s1.show();
    }
}
