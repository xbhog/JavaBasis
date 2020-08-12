package day8;

//字符串拼接升级版案例
/*定义一个方法，把 int 数组中的数据按照指定的格式拼接成一个字符串返回，调用该方法，
并在控制台输出结果。例如，数组为int[] arr = {1,2,3}; ，执行方法后的输出结果为：[1, 2, 3]

:定义一个 int 类型的数组，用静态初始化完成数组元素的初始化
2:定义一个方法，用于把 int 数组中的数据按照指定格式拼接成一个字符串返回。 返回值类型 String，参数列表 int[] arr
3:在方法中用 StringBuilder 按照要求进行拼接，并把结果转成 String 返回
4:调用方法，用一个变量接收结果 5:输出结果

*/


/*public class StringPractice2 {
    public static void main(String[] args) {
        int[] arr = {1,23,56,7};
        String s = arrayToString(arr);
        System.out.println(s);


    }

    public static String arrayToString(int[] arr){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int x = 0;x< arr.length;x++){
            if (x== arr.length-1){
                sb.append(arr[x]);
            }else {
                sb.append(arr[x]).append(",");
            }
        }sb.append("]");
        String ss = sb.toString();
        return ss;
    }
}
 */

import java.util.Scanner;

/*字符串反转升级版案例:
定义一个方法，实现字符串反转。键盘录入一个字符串，调用该方法后，在控制台输出结果
例如，键盘录入abc，输出结果 cba
* */
/*public class StringPractice2{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("请输入字符串：");
        String sc = s.nextLine();

        StringBuilder sb = new StringBuilder(sc);
        sb.reverse();
        System.out.println(sb);
    }
}
 */

public class StringPractice205 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("请输入字符串：");
        String line = s.nextLine();

        String ss = myReverse(line);
        System.out.println(ss);
    }

    public  static  String myReverse(String line){
        return new StringBuilder(line).reverse().toString();
    }
}

/*
*
* public StringBuilder append (任意类型) 添加数据，并返回对象本身
public StringBuilder reverse() 返回相反的字符序列
public int length() 返回长度，实际存储值
public String toString() 通过toString()就可以实现把StringBuilder转换为String
* */