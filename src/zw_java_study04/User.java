package zw_java_study04;

public class User {
    int id; // id
    String name; // �˻���
    String pwd; // ����
    public User() {
 
    }
    public User(int id, String name) {
        super();	//���췽���ĵ�һ������super()
        this.id = id;	//this��ʶ�����õĶ���
        this.name = name;
    }
    public User(int id, String name, String pwd) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }
    public static void main(String[] args) {
        User u1 = new User();
        User u2 = new User(101, "��С��");
        User u3 = new User(100, "���", "123456");     
    }
}