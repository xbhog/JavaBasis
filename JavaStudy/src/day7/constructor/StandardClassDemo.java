package day7.constructor;
/*
需求：定义标准学生类，要求分别使用空参和有参构造方法创建对象，空参创建的对象通过setXxx赋值，有
参创建的对象直接赋值，并通过show方法展示数据。
* */
public class StandardClassDemo {
    private String name;
    private int age;

    //创建方法
    public  StandardClassDemo(){}

    public StandardClassDemo(String name,int age){
        this.name = name;
        this.age = age;
    }

    //成员变量
    public void setName(String name){
        this.name = name;
    }
    public  String getName(){
        return name;
    }

    public  void  setAge(int age){
        this.age = age;
    }
    public  int getAge(){
        return age;
    }

    public void  show(){
        System.out.println(name+","+age);
    }
}
