package day7.constructor;

import day7.studentbase.StudentObject;

/*
* 作用：创建对象 Student stu = new Student();
格式：
    public class 类名{
    修饰符 类名( 参数 ) {
    }
    * }
功能：主要是完成对象数据的初始化
*
*
*   构造方法的创建:
        如果没有定义构造方法，系统将给出一个默认的无参数构造方法 如果定义了构造方法，系统将不再提供默认的构造方法
    构造方法的重载:
        如果自定义了带参构造方法，还要使用无参数构造方法，就必须再写一个无参数构造方法
    推荐的使用方式:
        无论是否使用，都手工书写无参数构造方法
    重要功能！
        可以使用带参构造，为成员变量进行初始化
* */
//基础结构
/*public class ConstructorDemo {
    private String name;
    private  int age;

    //构造方法
    public ConstructorDemo(){
        System.out.println("无构造方法");
    }
    public  void show(){
        System.out.println(name+","+age);
    }

}

 */
//知识点，private,this关键字等，函数重载，面向对象
public class ConstructorDemo{
    private String name;
    private int age;

    public ConstructorDemo(){}

    public  ConstructorDemo(String name){
        this.name  = name;
    }
    public  ConstructorDemo(int age){
        this.age = age;
    }
    public  ConstructorDemo(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void  show(){
        System.out.println(name+","+age);
    }
}