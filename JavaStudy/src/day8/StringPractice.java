package day8;
//用户登陆案例：
/*需求：
    已知用户名和密码，请用程序实现模拟用户登录。总共给三次机会，登录之后，给出相应的提示
 */
import java.util.Scanner;
/*public class StringPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String account = "admin";
        String pass = "1234";
        for(int x= 1;x<4;x++){
            System.out.print("请输入账号：");
            String admin = sc.nextLine();
            System.out.print("请输入密码：");
            String password = sc.nextLine();
            if(admin.equals(account) && password.equals(pass)){
                System.out.println("登陆成功.....");
                break;
            }else {
                if(x==3){
                    System.out.println("密码错误，你已输入三次，锁定...");
                    break;
                }
                System.out.println("【第"+x+"次错误，请重新输入....】");
            }
        }
    }
}
 */

/*遍历字符串案例:
需求：
    键盘录入一个字符串，使用程序实现在控制台遍历该字符串
    public char charAt(int index)：返回指定索引处的char值，字符串的索引也是从0开始的
* */
/*public class StringPractice{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("输入字符转：");
        String line = sc.nextLine();
        for (int x=0;x<line.length();x++){
            System.out.println(line.charAt(x));
        }

    }
}
 */

/*统计字符次数案例:
    键盘录入一个字符串，统计该字符串中大写字母字符，小写字母字符，数字字符出现的次数(不考虑其他字符)

思路：
    判断该字符属于哪种类型，然后对应类型的统计变量+1
    假如ch是一个字符，我要判断它属于大写字母，小写字母，还是数字，直接判断该字符是否在对应的范 围即可
        大写字母：ch>='A' && ch<='Z'
        小写字母： ch>='a' && ch<='z'
        数字： ch>='0' && ch<='9'
* */

/*public class StringPractice{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入字符串：");
        String line = sc.nextLine();

        //定义初始变量
        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;
        for (int x=0;x<line.length();x++){
            char ch = line.charAt(x);
            if (ch>='A' && ch<='Z'){
                bigCount++;
            }else if(ch>='a' && ch<='z'){
                smallCount++;
            }else {
                numberCount++;
            }
        }
        System.out.println("大写字母：" + bigCount + "个");
        System.out.println("小写字母：" + smallCount + "个");
        System.out.println("数字：" + numberCount + "个");
    }
}*/

/*字符串拼接案例:
需求：
    定义一个方法，把 int 数组中的数据按照指定的格式拼接成一个字符串返回，调用该方法，
    并在控制台输出结果。例如，数组为 int[] arr = {1,2,3}; ，执行方法后的输出结果为：[1, 2, 3]
* */

/*public class StringPractice{
    public static void main(String[] args) {
        int[] arr = {1,2,5,6};
        String flag =Joining(arr);
        System.out.println(flag);
    }
    public static String Joining(int[] arr){
        String s = "";
        s += "[";
        for (int x=0;x< arr.length;x++){
            if (x== arr.length-1){
                s +=arr[x];
            }else {
                s +=arr[x];
                s +=",";
            }

        }
        s += "]";
        return s;
    }
}
 */

/*字符串反转案例:
    定义一个方法，实现字符串反转。键盘录入一个字符串，调用该方法后，在控制台输出结果
    例如，键盘录入 abc，输出结果 cba

    在方法中把字符串倒着遍历，然后把每一个得到的字符拼接成一个字符串并返回
* */

/*public class  StringPractice{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入字符串：");
        String line = sc.nextLine();
        String flag = reserve(line);
        System.out.println(flag);

    }

    public static String reserve(String line){
        String s ="";
        for (int x=line.length()-1;x>=0;x--){
            s += line.charAt(x);
        }
        return s;
    }
}
*/