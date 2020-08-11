package day7.studentbase;
//学生对象
/*
*   需求：首先定义一个学生类，然后定义一个学生测试类，在学生测试类中通过对象完成成员变量和成员方法的使用
    分析：
        成员变量：姓名，年龄…
        成员方法：学习，做作业
* */
public class StudentObject {
    //成员变量
    String name;
    int age;

    //成员方法
    public void student(){
        System.out.println("学习");
    }
    public void work(){
        System.out.println("做作业");
    }
}
