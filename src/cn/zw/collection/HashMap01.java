package cn.zw.collection;

/**
 * �Զ���һ��HashMap
 * ʵ����put�������Ӽ�ֵ�ԣ�������˼��ظ���ʱ�򸲸���Ӧ�Ľڵ�
 * @author Administrator
 *
 */
public class HashMap01 {
	
	Node2[] table;//λͰ���顣 bucket arry
	int size;    //��ż�ֵ�Եĸ���
	public HashMap01() {
		table = new Node2[16];//����һ�㶨��Ϊ2��������
		
	}
	
	public void put(Object key,Object value) {	
		//�������µĽڵ����
		Node2 newNode = new Node2();
		newNode .hash = myHash(key.hashCode(), table.length);
		newNode .key = key;
		newNode.value = value;
		newNode.next = null;
		
		Node2 temp = table[newNode.hash];
		
		Node2 iterLast = null;
		boolean keyRepeat = false;//�ж�key�Ƿ��ظ�
		if (temp==null) {
			//�˴�����Ԫ��Ϊ�գ���ֱ�ӽ��½ڵ�Ž�ȥ
			table[newNode.hash] = newNode;
		}else {
			//�˴�����Ԫ�ز�Ϊ�գ���������Ӧ����
			while (temp!=null) {
				
				//�ж�key����ظ����򸲸�
				if (temp.key.equals(key)) {
					keyRepeat = true;
					System.out.println("key�ظ��ˣ�");
					temp.value = value;//ֻ����value��������ֵ(hash,key,next)���ֲ���
					
					break;
					
				}else {
					//key���ظ����������һ��
					iterLast = temp;
					temp = temp.next;
					
				}	
			}
			
			if (!keyRepeat) {//���û�з���key�ظ������������ӵ��������
				iterLast.next = newNode;
			}
			
		}
		
	}
	public static void main(String[] args) {
		HashMap01 m = new HashMap01();
		m.put(10, "aa");
		m.put(20, "bb");
		m.put(30, "cc");
		m.put(20, "ssss");
		
		m.put(53, "gg");
		m.put(69, "hh");
		m.put(85, "kk");
		
		System.out.println(m);
		
//		for (int i = 0; i < 100; i++) {
//			System.out.println(i+"----"+myHash(i,16));//53,69,85
//		}
	}
	
	public static int myHash(int v, int length) {
		System.out.println("hash in myHash:"+(v&(length-1)));//ֱ��λ���㣬Ч�ʸ�
		System.out.println("hash in myHash:"+(v%(length-1)));//ȡģ���㣬Ч�ʵ�
		
		return v&(length-1);
	}
	
}
