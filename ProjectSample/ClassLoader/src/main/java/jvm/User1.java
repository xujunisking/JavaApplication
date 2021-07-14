package jvm;

public class User1 {

    private int id;
    private String name;

    public User1() {}

    public User1(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public int getId() {return id;}
    public void setId(int id) {this.id=id;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    @Override
    protected  void finalize() throws Throwable {
        System.out.println("关闭资源，user" + id + "即将被回收");
    }

    public void sout() {
        System.out.println("=======自己的加载器加载类调用方法=======");
    }
}
