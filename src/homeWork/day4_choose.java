package homeWork;
/**
 * ������ѡ����
 * 
 * ������ѡ��ӦѡC����ѡB
 * @author Administrator
 *
 */

public class day4_choose {
	public static void main(String[] args) {
		/**
		 * 1.��������й���Java���췽����˵���������( )��(ѡ��һ��)

����A.���췽����������Ϊ����������г�ʼ���������������Ա������ֵ

����B.һ��Java�����û�й��췽����Ҳ�����ṩ1���������췽��

����C.���췽������ͬ����������д����ֵ����

����D.���췽���ĵ�һ����������super()�������ʡ�ԣ�����������ǵ��ø����޲����Ĺ��췽��
		 */
		
		/**
		 * 2.��Java�У����³���������к��������Ϊ( D)��(ѡ��һ��)
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
		
		
//		3.��Java�й��ھ�̬����������˵������ȷ����(AC )��(ѡ�����)
//
//		����A.��̬�����в���ֱ�ӵ��÷Ǿ�̬����
//
//		����B.�Ǿ�̬�����в���ֱ�ӵ��þ�̬����
//
//		����C.��̬��������������ֱ�ӵ���
//
//		����D.��̬���������ʹ��this
		
		
//		4.����ѡ���й���Java���෽����˵���������( AC)��(ѡ�����)
//
//		����A.���෽���п���this�����ñ�����෽��              //��̬�಻��ʹ��this
//
//		����B.���෽���е��ñ�����෽��ʱ��ֱ�ӵ���
//
//		����C.���෽����ֻ�ܵ��ñ����е��෽��
//
//		����D.���෽���е���ʵ��������Ҫ�ȴ�������
		
		
//		��5.��������Java����Ĵ�����ʾ����������к����������( C)��(ѡ��һ��)
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
