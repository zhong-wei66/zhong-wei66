package homeWork;
/**
 * 第四章选择题
 * 
 * 第五题选错，应选C，错选B
 * @author Administrator
 *
 */

public class day4_choose {
	public static void main(String[] args) {
		/**
		 * 1.以下语句中关于Java构造方法的说法错误的是( )。(选择一项)

　　A.构造方法的作用是为创建对象进行初始化工作，比如给成员变量赋值

　　B.一个Java类可以没有构造方法，也可以提供1个或多个构造方法

　　C.构造方法与类同名，不能书写返回值类型

　　D.构造方法的第一条语句如果是super()，则可以省略，该语句作用是调用父类无参数的构造方法
		 */
		
		/**
		 * 2.在Java中，以下程序编译运行后的输出结果为( D)。(选择一项)
		 * public class Test {
    			int x, y;
    			Test(int x, int y) {
        			this.x = x;
        			this.y = y;
    			}
    			public static void main(String[] args) {
        			Test pt1, pt2;
        			pt1 = new Test(3, 3);
        			pt2 = new Test(4, 4);
        			System.out.print(pt1.x + pt2.x);
    			}
			}
	
		 *
		 *  A.6
			B.34
			C.8
			D.7
		 */
		
		
//		3.在Java中关于静态方法，以下说法中正确的是(AC )。(选择二项)
//
//		　　A.静态方法中不能直接调用非静态方法
//
//		　　B.非静态方法中不能直接调用静态方法
//
//		　　C.静态方法可以用类名直接调用
//
//		　　D.静态方法里可以使用this
		
		
//		4.下列选项中关于Java中类方法的说法错误的是( AC)。(选择二项)
//
//		　　A.在类方法中可用this来调用本类的类方法              //静态类不能使用this
//
//		　　B.在类方法中调用本类的类方法时可直接调用
//
//		　　C.在类方法中只能调用本类中的类方法
//
//		　　D.在类方法中调用实例方法需要先创建对象
		
		
//		　5.分析如下Java程序的代码所示，则编译运行后的输出结果是( C)。(选择一项)
//		public class Test {
//		    int count=9;
//		    public void count1(){
//		        count=10;
//		        System.out.print("count1="+count);
//		    }
//		    public void count2(){
//		        System.out.print("count2="+count);
//		    }
//		    public static void main(String[ ] args) {
//		        Test t=new Test();
//		        t.count1();
//		        t.count2();
//		    }
//		}
		
//		A.count1=9; count2=9;
//	     B.count1=10;count2=9;
//	     C.count1=10; count2=10;
//	     D.count1=9; count2=10;
		
	}

}
