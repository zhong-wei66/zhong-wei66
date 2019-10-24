package cn.zw.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * 测试HashMap的常用方法
 * @author Administrator
 *
 */
public class TestMap2 {
	public static void main(String[] args) {
		Employee e1 = new Employee(1001, "钟微", 50000);
		Employee e2 = new Employee(1002, "小二", 6000);
		Employee e3 = new Employee(1003, "小五", 7000);
		Employee e4 = new Employee(1001, "小六", 8000);
		
		Map<Integer, Employee> map = new HashMap<>();
		
		map.put(1001,e1);
		map.put(1002,e2);
		map.put(1003,e3);
		map.put(1004,e4);
		
		Employee emp = map.get(1001);
		System.out.println(emp.getEname());
		System.out.println(map);
		
	}

}

//雇员信息
class Employee{
	private int id;
	private String ename;
	private double salary;
	
	public Employee(int id, String ename, double salary) {
		super();
		this.id = id;
		this.ename = ename;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
}
