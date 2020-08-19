package day10;

import org.w3c.dom.ls.LSOutput;
//ALT+Insert    --可以自动构建无参与有参的构造方法
public class StAdminPro {
    //学号
    private String sid;
    //性名
    private  String name;
    //年龄
    private String age;
    //居住地
    private String address;

    public StAdminPro(){}

    public StAdminPro(String sid,String name,String age,String address){
        this.sid = sid;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getSid(){
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
