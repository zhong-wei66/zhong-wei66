package zw_java_study03;

/**
 * ��������ҵ
 * ���ģ�3��5
 * 
 * @author Administrator
 *
 */

public class WorkDay03 {
	public static void main(String[] args) {
		//1.��������Java���룬�������е���������( )��(ѡ��һ��)
		//Ԥ���ΪA
		//�����Ԥ����ȷ
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
	     * A��!(a&&b)
	     * B.!(a||b)
	     * C.ab
	     * D.!(a||b)ab
	     * 
	     * */
	    
	    //2.����ѡ���й��ڱ���x�Ķ��壬( )��ʹ����switch������ͨ����(ѡ�����)
	    //Ԥ���Ϊ��B��D
	    //�����Ԥ����ȷ
	    
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
	        
	      //3.��������Java���룬�������еĽ����( )��(ѡ��һ��)
	        //Ԥ��ѡD,ʵ��ΪA
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
	         D.ʲôҲ�����*/
	        
	      //��5.���¹��ڷ������õĴ����ִ�н����( )��(ѡ��һ��)
	        //Ԥ��ѡC.299,ʵ��ΪB.199
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

����			B.199

����			C.299

����			D.99100
	        */
	        
	        
	}
	    
	    
	}

}
