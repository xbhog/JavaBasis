package day7.constructor;
//基础测试结构
/*public class ConstructorTest {
    public static void main(String[] args) {
        ConstructorDemo c = new ConstructorDemo();
        c.show();
    }
}
 */
public class ConstructorTest{
    public static void main(String[] args) {
        //创建对象
        ConstructorDemo c1 = new ConstructorDemo();
        c1.show();

        //public ConstructorDemo(String name)
        ConstructorDemo c2 = new ConstructorDemo("xbhog");
        c2.show();

        //public ConstructorDemo(int age)
        ConstructorDemo c3 = new ConstructorDemo(30);
        c3.show();

        //public ConstructorDemo(String name,int age)
        ConstructorDemo c4 = new ConstructorDemo("java",88);
        c4.show();
    }
}