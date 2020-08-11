package day7.encapsulation;

public class TestDemo {
    public static void main(String[] args) {
        //创建对象
        EncapsulationDemo e = new EncapsulationDemo();
        //使用set方法给成员变量赋值
        e.setName("xbhog");
        e.setAge(23);

//        e.show();

        System.out.println(e.getName()+"-----"+e.getAge());
    }
}
