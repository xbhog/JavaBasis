package day8;

/*
String类：内容是不可变的
StringBuilder类：内容是可变的

public StringBuilder() 创建一个空白可变字符串对象，不含有任何内容
public StringBuilder(String str) 根据字符串的内容，来创建可变字符串对象
* */
/*public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println("sb:"+sb);
        System.out.println("sb.length():"+sb.length());

        StringBuilder sb2 = new StringBuilder("hello");
        System.out.println("sb2:"+sb2);
        System.out.println("sb2.length():"+sb2.length());

    }
}
 */
/*
*   public StringBuilder append(任意类型) 添加数据，并返回对象本身
    public StringBuilder reverse() 返回相反的字符序列
* */
/*public class StringBuilderDemo{
    public static void main(String[] args) {
        //创建对象
        StringBuilder sb = new StringBuilder();
//        StringBuilder sb2 = sb.append("hello");
//        System.out.println("sb:"+sb);
//        System.out.println("sb2:"+sb2);
        //链式编程
        sb.append("hello").append("world").append("java").append(100);
        System.out.println("sb:"+sb);

        //字符反转
        sb.reverse();
        System.out.println("sb:"+sb);

    }
}
 */

/*
* StringBuilder转换为String:
    public String toString()：
       通过 toString() 就可以实现把 StringBuilder 转换为 String
String转换为StringBuilder:
    public StringBuilder(String s)：
       通过构造方法就可以实现把 String 转换为 StringBuilder*/
/*public class StringBuilderDemo{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("hello");
        //把 StringBuilder 转换为 String
        String s = sb.toString();
        //String ss = sb;---错误写法
        System.out.println(s);

        //String 转换为 StringBuilder
        String ss = "helloworld";
        StringBuilder ssbb = new StringBuilder(ss);
        System.out.println(ssbb);
    }
}

 */