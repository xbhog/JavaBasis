package day2.demo;
//算数运算符---自增自减运算符
public class countSum {
    public static void main(String[] args) {
        /*int a = 10;
        int b = 20;
        //算数运算符
        System.out.println(a / b );
        System.out.println(a % b);

        //字符的“+”操作
        char ch1 = 'a';
        System.out.println(ch1+1);

        char ch2 = 'A';
        System.out.println(ch2 + 1);

        char ch3 = '0';
        System.out.println(ch3 + 1);

        //类型规则:byte,short,char --> int --> long --> float --> double
        byte b1 = 10;
        byte b2 = 20;
        int i3 = b1 + b2;
        //因为byte类型参与算术运算会自动提示为int，
        // int赋值给byte可能损失 精度
        //byte b3 = b1 + b2;
        byte b4 = (byte)(b1 + b2);


        //字符串的+操作 字符串表示 ----“”
        System.out.println("itesad"+666);

        //当连续进行“+”操作时，从左到右逐个执行
        System.out.println(1 + 99 +"HelloWorld");

        // 可以使用小括号改变运算的优先级
        System.out.println(1+2+"sda" +(3+4));


        short s = 10;
        //此行代码报出，因为运算中s提升为int类型，运算结果int赋值给short可能损失精度
        //s = s + 10;
        // 此行代码没有问题，隐含了强制类型转换，相当于 s = (short) (s + 10);
        //扩展的赋值运算符隐含了强制类型转换(++,--)
        s += 10;

        // 自增自减运算符
        /*
        * 单独使用的时候， ++和-- 无论是放在变量的前边还是后边，结果是一样的。
        * */

        /*int i = 10;
        i ++;
        System.out.println("i:" + i);

        int j=10;
        ++j;
        System.out.println("j:" + j);
//
        //参与操作的时候，如果放在变量的后边，先拿变量参与操作，后拿变量做++或者--。
        int x = 10;
        int y = x ++;
        System.out.println("x:" +x+", y:" +y);

        //参与操作的时候，如果放在变量的前边，先拿变量做++或者--，后拿变量参与操作。
        int m=10;
        int n = ++ m;
        System.out.println("m:" + m + ", m:" + m);
        */
//        //练习  结果：33
//        int x1 = 10;
//        int Y = x1++ + x1++ + x1++;
//        System.out.println(Y);
        //分解
//        int y1 = x1++;
//        System.out.println(y1);
//        System.out.println("----------------");
//        int y2 = x1++;
//        System.out.println(y2);
//        System.out.println("----------------");

//        int y3 = x1++;
//        System.out.println(y3);
//        System.out.println("----------------");
//        System.out.println(y1+y2+y3);
        System.out.println("demo");

    }
}
