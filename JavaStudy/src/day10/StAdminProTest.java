package day10;
import java.util.ArrayList;
import java.util.Scanner;


public class StAdminProTest {
    //主函数
    public static void main(String[] args) {
        //创建集合对象，用于保存学生数据信息
        ArrayList<StAdminPro> array = new ArrayList<>();
        //使用循环完成再次回到主界面
        while (true){
            //用输出语句完成主界面的编写
            System.out.println("----欢迎来到学生管理系统-----");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看所有学生");
            System.out.println("5 退出");
            System.out.println("请输入你的选择：");

            //使用SCanner实现键盘数据输入
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();

            //使用switch语句完成操作的选择
            switch (line){
                case "1":
                    addStudent(array);
                    break;
                case "2":
                    deleteStudent(array);
                    break;
                case "3":
                    updateStudent(array);
                    break;
                case "4":
                    findAllStudent(array);
                    break;
                case "5":
                    System.out.print("谢谢使用");
                    System.exit(0);//jvm退出


            }

        }

    }

    //添加学生的信息
    public static void addStudent(ArrayList<StAdminPro> array){
        //键盘键入学生对象所需要的数据，显示提示信息，提示要输入何种信息
        Scanner add = new Scanner(System.in);
        String sid;

        while(true){
            System.out.print("请输入3位数学号：");
            sid = add.nextLine();
//            if (sid.length() == 3){
//                break;
//            }else {
//                System.out.println("不符合3位学号");
//
//            }
            boolean flag = isUesd(array,sid);
            if(flag){
                System.out.println("你输入的学号已经被占用，请重新输入");
            }else {
                break;
            }
        }

        System.out.print("请输入性名:");
        String name = add.nextLine();

        System.out.print("请输出年龄：");
        String age = add.nextLine();

        System.out.print("请输入居住地：");
        String address = add.nextLine();

        StAdminPro sc = new StAdminPro();
        //设置数据
        sc.setSid(sid);
        sc.setName(name);
        sc.setAge(age);
        sc.setAddress(address);

        //将数据添加到数组中
        array.add(sc);

        System.out.println("数据录入完成");


    }

    //判断学号是否被使用
    public static boolean isUesd(ArrayList<StAdminPro> array,String sid){
        boolean flag = false;
        for (int x= 0;x<array.size();x++){
            StAdminPro st = array.get(x);
            if (st.getSid().equals(sid)){
                flag = true;
                break;
            }
        }
        return flag;
    }

    //查看学生信息
    public static void findAllStudent(ArrayList<StAdminPro> array){
        if (array.size()==0){
            System.out.println("还没有数据，请添加数据");
            return;
        }

        //显示表头信息
        //\t其实是一个tab键的位置
        System.out.println("学号\t\t姓名\t\t\t年龄\t\t居住地");


        for (int x=0;x<array.size();x++){
            StAdminPro s = array.get(x);
            System.out.println(s.getSid()+"\t\t"+s.getName() +"\t\t"  +s.getAge()+"岁\t"+s.getAddress());
        }
    }

    //删除学生信息
    public static void deleteStudent(ArrayList<StAdminPro> array){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入删除的学号：");
        String sid = sc.nextLine();

        int index = -1;

        for (int x=0;x<array.size();x++){
            StAdminPro s = array.get(x);
            if (s.getSid().equals(sid)){
                index = x;
                break;
            }
        }
        if (index ==-1){
            System.out.println("信息不存在，请重新输入");
        }else {
            array.remove(index);
            System.out.println("删除成功");
        }
    }

    //修改学生信息
    public static void updateStudent(ArrayList<StAdminPro> array){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入修改的学号：");
        String sid = sc.nextLine();


        //键盘录入要修改的学生信息
        System.out.println("请输入学生新姓名：");
        String name = sc.nextLine();
        System.out.println("请输入学生新年龄：");
        String age = sc.nextLine();
        System.out.println("请输入学生新居住地：");
        String address = sc.nextLine();

        //创建学生对象
        StAdminPro s = new StAdminPro();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);

        for (int x=0;x<array.size();x++){
            StAdminPro ss = array.get(x);
            if (ss.getSid().equals(sid)){
                array.set(x,s);
            }
        }
        System.out.println("信息修改成功");
    }


}
