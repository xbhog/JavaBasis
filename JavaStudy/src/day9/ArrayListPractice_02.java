package day9;

import day7.studentbase.StudentDemo;

import java.util.ArrayList;
import java.util.Scanner;

/*ArrayList存储字符串并遍历:
    创建一个存储字符串的集合，存储3个字符串元素，使用程序实现在控制台遍历该集合
* */
/*public class ArrayListPractice_02 {
    public static void main(String[] args) {
        //创建字符串集合
        ArrayList<String> array = new ArrayList<String>();

        array.add("name");
        array.add("xbhog");
        array.add("python");
        array.add("java");
        //依次将array集合中的元素赋值给s相当于for循环简写
        for (String s : array) {
            System.out.println(s);
        }
        //上面效果等同于下面效果
        for (int i=0; i<array.size(); i++){
            System.out.println(array.get(i));

        }

    }
}
 */
/*
* ArrayList存储学生对象并遍历：
* 创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合
* */

/*public class ArrayListPractice_02{
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<Student> array = new ArrayList<Student>();

        Student s1 =new Student("xbhog",30);
        Student s2 =new Student("python",20);
        Student s3 =new Student("java",40);

        array.add(s1);
        array.add(s2);
        array.add(s3);
        for (int i = 0; i < array.size(); i++) {
            //s = {name:xbhog;age:30}
            Student s = array.get(i);
            System.out.println(s.getName() + "," + s.getAge());
        }



    }
}
 */

/*
* 创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合
学生的姓名和年龄来自于键盘录入
*
* 思路：
    * 1:定义学生类，为了键盘录入数据方便，把学生类中的成员变量都定义为String类型
    * 2:创建集合对象
    * 3:键盘录入学生对象所需要的数据
    * 4:创建学生对象，把键盘录入的数据赋值给学生对象的成员变量
    * 5:往集合中添加学生对象
    * 6:遍历集合，采用通用遍历格式实现
*
* */
public class ArrayListPractice_02{
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<Student> array = new ArrayList<Student>();

        //为了提高代码的复用性，我们用方法来改进程序
        addStudent(array);
        addStudent(array);
        addStudent(array);

        //遍历集合，采用通用遍历格式实现
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            System.out.println(s.getName() + "," + s.getAge());
        }
    }

    /*
        两个明确：
            返回值类型：void
            参数：ArrayList<Student> array
     */
    public static void addStudent(ArrayList<Student> array) {
        //键盘录入学生对象所需要的数据
        Scanner sc = new Scanner(System.in);

        System.out.print("请输入学生姓名:");
        String name = sc.nextLine();

        System.out.print("请输入学生年龄:");
        String age = sc.nextLine();

        //创建学生对象，把键盘录入的数据赋值给学生对象的成员变量
        Student s = new Student();
        s.setName(name);
        s.setAge(age);

        //往集合中添加学生对象
        array.add(s);
    }
}
