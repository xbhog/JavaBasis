package day7.studentbase;

//学生对象测试类--需要main函数
public class StudentDemo {
    public static void main(String[] args) {
        //创建学生对象
        StudentObject s = new StudentObject();

        //使用成员变量
        s.name = "xbhog";
        s.age = 17;
        System.out.println(s.name);
        System.out.println(s.age);

        //使用成员方法
        s.student();
        s.work();
    }
}

