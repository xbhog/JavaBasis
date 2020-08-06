package day5;

//方法概述
////无参数方法定义和调用
/*
public class methodview {
    public static void main(String[] args) {
        /*
        方法（method）是将具有独立功能的代码块组织成为一个整体，使其具有特殊功能的代码集
        注意：
        方法必须先创建才可以使用，该过程成为方法定义
        方法创建后并不是直接可以运行的，需要手动使用后，才执行，该过程成为方法调用
        调用方法需要在main函数中调用
        *//*
        method();
        getMax();
    }

    //方法必须先定义，后调用，否则程序将报错
    public  static  void method(){
        //方法体
        System.out.println("demo");
        int number = 10;
        number = 9;
        if (number %2 == 0){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
    /*需求：设计一个方法用于打印两个数中的较大数
            思路：
            ①定义一个方法，用于打印两个数字中的较大数，例如getMax()
            ②方法中定义两个变量，用于保存两个数字
            ③使用分支语句分两种情况对两个数字的大小关系进行处理
            ④在main()方法中调用定义好的方法代码：

            */
    /*public static void getMax() {
        int a = 10;
        int b = 20;

        if(a > b){
            System.out.println(a);
        }else {
            System.out.println(b);
        }

    }

}
*/


//带参数方法定义和调用
/*public class methodview {
    public static void main(String[] args) {
        /*定义格式：
        /*参数：由数据类型和变量名组成 - 数据类型 变量名
        /*方法定义时，参数中的数据类型与变量名都不能缺少，缺少任意一个程序将报错
        方法定义时，多个参数之间使用逗号( ，)分隔
        调用格式：
        方法名(参数)； 方法名(参数1,参数2);*/
        /*isevenNumbe(10);
        getMax(10,20);
    }

    public  static void isevenNumbe(int number){
        System.out.println("我是isevenNumbe");
        System.out.println(number);
    }
    public static void getMax(int num1,int num2){
        System.out.println("我是getMax");
        System.out.println(num1);
        System.out.println(num2);
    }

}
*/


/*public class methodview{
    public static void main(String[] args) {
    //形参：方法中定义的参数
    //实参：方法中调用的参数
    /*
    需求：设计一个方法用于打印两个数中的较大数，数据来自于方法参数 }
        思路：
        ①定义一个方法，用于打印两个数字中的较大数，例如getMax()
        ②为方法定义两个参数，用于接收两个数字
        ③使用分支语句分两种情况对两个数字的大小关系进行处理
        ④在main()方法中调用定义好的方法（使用常量）
        ⑤在main()方法中调用定义好的方法（使用变量）
    * */
 /*       //常量的使用
        getmax(10,20);
        //变量的使用
        int a = 10;
        int b = 20;
        getmax(a,b);
        //上面是实参
    }

    public static void getmax(int num1,int num2){
        //int number 形参
        if(num1>num2) {
            System.out.println(num1);
        }else {
            System.out.println(num2);
        }

    }
}
  */


//带返回值方法的定义和调用
/*public class methodview{
    public static void main(String[] args) {
        /*
        * 方法定义时return后面的返回值与方法定义上的数据类型要匹配，否则程序将报错
        * 方法名 ( 参数 ) ;
        * 数据类型 变量名 = 方法名 ( 参数 ) ;
        * 方法的返回值通常会使用变量接收，否则该返回值将无意义
        * */

        /*isevenNumber(5);
        boolean flag = isevenNumber(5);
        System.out.println(flag)
        getmax(10,20);
        int num = getmax(10,20);
        System.out.println(num)
    }
    //范例
    public static boolean isevenNumber(int number){
        System.out.println(number);
        return true;
    }
    public static int getmax(int a,int b){
        System.out.println(a);
        System.out.println(b);
        return 100;
    }
}
         */


//带返回值方法的练习
/*
* 需求：设计一个方法可以获取两个数的较大值，数据来自于参数
    思路：
    ①定义一个方法，用于获取两个数字中的较大数
    ②使用分支语句分两种情况对两个数字的大小关系进行处理
    ③根据题设分别设置两种情况下对应的返回结果
    ④在main()方法中调用定义好的方法并使用变量保存
    ⑤在main()方法中调用定义好的方法并直接打印结果
* */

/*public class methodview{
    public static void main(String[] args) {
        //在main()方法中调用定义好的方法并使用变量保存
        int result = getmax(10,20);
        System.out.println(result);
        //在main()方法中调用定义好的方法并直接打印结果
        System.out.println(getmax(10,20));
    }

    public static int getmax(int a,int b){
        //根据题设分别设置两种情况下对应的返回结果
        if(a>b){
            return a;
        }else {
            return b;
        }
    }
}

 */
//方法的注意事项
/*
* 1. 方法不能嵌套
* 3. void表示无返回值，可以省略return，也可以单独的书写return，后面不加数据
* */

//方法通用格式
/*
* public static 返回值类型 方法名(参数) {
*   方法体; return 数据 ;
* }
*
* 定义方法时，要做到两个明确
    1. 明确返回值类型：主要是明确方法操作完毕之后是否有数据返回，如果没有，写void；如果有，写对应的数据类型
    2. 明确参数：主要是明确参数的类型和数量
    调用方法时的注意：
        void类型的方法，直接调用即可
        非void类型的方法，推荐用变量接收调用
6.
*
* */