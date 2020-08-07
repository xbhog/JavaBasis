package day5;

//方法重载
/*
*方法重载概念
    方法重载指同一个类中定义的多个方法之间的关系，满足下列条件的多个方法相互构成重载
        多个方法在同一个类中
        多个方法具有相同的方法名
        多个方法的参数不相同，类型不同或者数量不同
注意：
    重载仅对应方法的定义，与方法的调用无关，调用方式参照标准格式
    重载仅针对同一个类中方法的名称与参数进行识别，与返回值无关，换句话说不能通过返回值来判定两
    个方法是否相互构成重载
* */

/*
* 需求：使用方法重载的思想，设计比较两个整数是否相同的方法，兼容全整数类型（byte,short,int,long）
思路：
    ①定义比较两个数字的是否相同的方法compare()方法，参数选择两个int型参数
    ②定义对应的重载方法，变更对应的参数类型，参数变更为两个long型参数
    ③定义所有的重载方法，两个byte类型与两个short类型参数
    ④完成方法的调用，测试运行结果
* */
/*public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(fn(10,20));
        System.out.println(fn((byte) 10,(byte) 20));
        System.out.println(fn((short) 10,(short) 20));
        System.out.println(fn(10L,20L));

    }
    public  static boolean fn(int a,int b){
        System.out.println("int");
        return a == b ;

    }
    public  static  boolean fn(byte a,byte b){
        System.out.println("byte");
        return a == b;

    }
    public static  boolean  fn(short a,short b){
        System.out.println("short");
        return a==b;
    }

    public  static  boolean fn(long a,long b){
        System.out.println("long");
        return  a==b;
    }

}

 */
//方法的参数传递(基本类型)---返回值为100
//基本数据类型的参数，形式参数的改变，不影响实际参数
/*public  class  MethodOverloading{
    public static void main(String[] args) {
        int number = 100;
        System.out.println(number);
        //int flag = charger(number);
        //System.out.println(flag);
        charger(number);
        System.out.println(number);
    }
    /*public static int charger(int number){
        number = 200;

        return number;
    }*/
    /*public  static  void charger(int number){
        number = 200;
    }
}
*/

// 方法参数传递引用类型
/*返回值为200
    对于引用类型的参数，形式参数的改变，影响实际参数的值
    引用数据类型的传参，传入的是地址值，内存中会造成两个引用指向同一个内存的效果，所以即使方法
    弹栈，堆内存中的数据也已经是改变后的结果
*/
/*public  class MethodOverloading{
    public static void main(String[] args) {
        int[] a = {1,2,3};
        System.out.println("调用charger方法前："+a[1]);
        change(a);
        System.out.println("调用charger方法后："+ a[1]);
    }
    public static void change(int[] a){
        a[1] = 200;
    }
}

 */