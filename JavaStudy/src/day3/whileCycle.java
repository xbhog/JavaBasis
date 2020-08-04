package day3;

/*public class whileCycle {
    public static void main(String[] args) {
        int j = 1;
        while(j<=5){
            System.out.println(j);
            j++;
        }
    }
}
*/

/*
* 需求：世界最高山峰是珠穆朗玛峰(8844.43米=8844430毫米)，假如我有一张足够大的纸，它的厚度是0.1毫
米。请问，我折叠多少次，可以折成珠穆朗玛峰的高度?
* */
/*
public class whileCycle{
    ////因为要反复折叠，所以要使用循环，但是不知道折叠多少次，这种情况下更适合使用while循环
    // 折叠的过程中当纸张厚度大于珠峰就停止了，因此继续执行的要求是纸张厚度小于珠峰高度
    public static void main(String[] args) {
        int zf = 8844430;
        int count = 0;
        double paper = 0.1;
        while(paper<=zf){
            paper *=2;
            count++;
        }
        System.out.println("折叠"+count+"次");
    }
}

 */
/*
* 初始化语句;
* do {循环体语句; 条件控制语句;
* }while(条件判断语句);
* */
/*public class whileCycle{
    public static void main(String[] args) {
        int j = 1;
        do{
            System.out.println(j);
            j++;
        }while (j<=5);
    }
}
 */
//外循环执行一次，内循环执行一圈
public class whileCycle{
    public static void main(String[] args) {
        for (int h=0 ;h<24;h++){
            for (int min=0;min<60;min++){
                System.out.println(h+"时"+min+"分");
            }
        }
        System.out.println("---------");
    }
}