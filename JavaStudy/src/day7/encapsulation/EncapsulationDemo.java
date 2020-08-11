package day7.encapsulation;

/*
*  需求：定义标准的学生类，要求name和age使用private修饰，并提供set和get方法以及便于显示数据的show方法，测试类中创建对象并使用，最终控制台输出
*
*
* private是一个修饰符，可以用来修饰成员（成员变量，成员方法）
    被private修饰的成员，只能在本类进行访问，针对private修饰的成员变量，如果需要被其他类使用，提供相应的操作
    提供“get变量名()”方法，用于获取成员变量的值，方法用public修饰
    提供“set变量名(参数)”方法，用于设置成员变量的值，方法用public修饰
* */
public class EncapsulationDemo {
    private String name;
    private  int age;
    //设置名字
    public void setName(String n){
        name = n;
    }
    //获取名字
    public  String  getName(){
        return name;

    }

    //设置年龄
    public void setAge(int m){
        age = m;
    }
    //获取年龄
    public  int getAge(){
        return age;
    }
    //显示信息
    public  void show(){
        System.out.println(name+","+age);
    }

}
