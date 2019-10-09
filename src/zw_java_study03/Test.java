package zw_java_study03;

public class Test {
    public static void main(String args[]) {
        int i = 99;
        mb_operate(i);
        System.out.print(i + 100);
    }
    static void mb_operate(int i) {
        i += 100;
        System.out.println(i);
    }
}
