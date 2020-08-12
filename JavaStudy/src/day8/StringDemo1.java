package day8;

/*public class StringDemo1 {
    public static void main(String[] args) {
        //public String():创建一个空白字符串对象，不含任何内容
        String s1 = new String();
        System.out.println("s1:"+s1);

        //public String(char[] chs):根据字符数组的内容，来创建字符串对象
        char[] chs = {'a','b','c'};
        String s2 = new String(chs);
        System.out.println("s2:"+s2);

        //public String(byte[] bys)：根据字节数组的内容，来创建字符串对象
        //ASCII对照表：97-a;98-b;99-c;
        byte[] bys = {97,98,99};
        String s3 = new String(bys);
        System.out.println("s3:"+s3);

        //String s = “abc”; 直接赋值的方式创建字符串对象，内容就是abc
        String s4 = "abc";
        System.out.println("s4:"+s4);

    }

}
 */
/*创建字符串对象两种方式的区别:
* 通过构造方法创建
    通过 new 创建的字符串对象，每一次 new 都会申请一个内存空间，虽然内容相同，但是地址值不同
直接赋值方式创建
    以“”方式给出的字符串，只要字符序列相同(顺序和大小写)，无论在程序代码中出现几次，JVM 都只会建立一
    个 String 对象，并在字符串池中维护
*
*
* */