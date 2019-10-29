package cn.zw.collection;

import java.util.Map;
import java.util.TreeMap;

/**
 * ����TestTreeMap��ʹ��
 * @author Administrator
 *
 */

public class TestTreeMap {
	public static void main(String[] args) {
		Map<Integer, String> treemap1 = new TreeMap<>();
		treemap1.put(20, "aa");
		treemap1.put(3, "bb");
		treemap1.put(6, "cc");
		
		//����key�����ķ�ʽ����
		for (Integer key:treemap1.keySet()) {
			System.out.println(key+"---"+treemap1.get(key));
		}
		
		Map<Emp, String> treemap2 = new TreeMap<Emp, String>();
		treemap2.put(new Emp(100, "����", 50000), "�����Ǹ���С��");
		treemap2.put(new Emp(200, "����", 5000), "�����Ǹ���С��");
		treemap2.put(new Emp(150, "����", 6000), "�����Ǹ���С��");
		treemap2.put(new Emp(50, "����", 6000), "�����Ǹ���С��");
		
		//����key�����ķ�ʽ����
		for (Emp key:treemap2.keySet()) {
			System.out.println(key+"---"+treemap2.get(key));
		}
		
	}

}

class Emp implements Comparable<Emp> {
	int id;
	String name;
	double salary;
	
	public Emp(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "id:"+id+" name:"+name+" salary:"+salary;
	}

	@Override
	public int compareTo(Emp o) {//������С�ڣ�0�����ڣ�����������
		
		if (this.salary>o.salary) {
			return 1;
		}else if(this.salary<o.salary) {
			return -1;
		}else {
			if (this.id>o.id) {//������ͬ��id����
				return 1;
			}else if (this.id<o.id) {
				return -1;
			}else {
				return 0;
			}
		}
		
		
	}

	
	
	
}
