package zw_java_study03;

/**
 * 第三章作业
 * 答错的：3、5
 * 
 * @author Administrator
 *
 */

public class WorkDay03 {
	public static void main(String[] args) {
		//1.分析如下Java代码，编译运行的输出结果是( )。(选择一项)
		//预测答案为A
		//结果：预测正确
		boolean a=true;
	    boolean b=false;
	    if (!(a&&b)) {
	        System.out.print("!(a&&b)");
	    }else if (!(a||b)) {
	        System.out.println("!(a||b)");
	    }else {
	        System.out.println("ab");
	    }
	    
	    /*
	     * A，!(a&&b)
	     * B.!(a||b)
	     * C.ab
	     * D.!(a||b)ab
	     * 
	     * */
	    
	    //2.下列选项中关于变量x的定义，( )可使以下switch语句编译通过。(选择二项)
	    //预测答案为：B、D
	    //结果：预测正确
	    
	    char x = 100;
	    //int x = 100;
	    switch(x) {
	    case 100 :
	        System.out.println("One hundred");
	        break;
	    case 200 :              
	        System.out.println("Two hundred");                 
	        break;
	    case 300 :
	        System.out.println( "Three hundred");
	        break;
	    default :
	        System.out.println( "default"); 
	        
	        /*
	         * A.double x = 100;
	         * B.char x = 100;
	         * C.String x = "100";
	         * D.int x = 100;*/
	        
	      //3.给定如下Java代码，编译运行的结果是( )。(选择一项)
	        //预测选D,实际为A
	        /*
	        public class Test { 
    public static void main(String[] args) {
        int sum=0;
        for(int i=1;i<10;i++){
            do{
                i++;
                if(i%2!=0)
                    sum+=i;
            }while(i<6);
        }
        System.out.println(sum);
    }
}
	         A.8
	         B.15
	         C.24
	         D.什么也不输出*/
	        
	      //　5.以下关于方法调用的代码的执行结果是( )。(选择一项)
	        //预测选C.299,实际为B.199
	        /*
	        public class Test {
	            public static void main(String args[]) {
	                int i = 99;
	                mb_operate(i);
	                System.out.print(i + 100);
	            }
	            static void mb_operate(int i) {
	                i += 100;
	            }
	        }
	        A.99

　　			B.199

　　			C.299

　　			D.99100
	        */
	        
	        
	}
	    
	    
	}

}
