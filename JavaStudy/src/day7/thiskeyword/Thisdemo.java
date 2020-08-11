package day7.thiskeyword;
//关键字
/*
* this修饰的变量用于指代成员变量，其主要作用是（区分局部变量和成员变量的重名问题）
    方法的形参如果与成员变量同名，不带this修饰的变量指的是形参，而不是成员变量
    方法的形参没有与成员变量同名，不带this修饰的变量指的是成员变量
* */
public class Thisdemo {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void show() {
        System.out.println(name + "," + age);
    }
}
