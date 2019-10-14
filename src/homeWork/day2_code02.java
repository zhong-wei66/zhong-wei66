package homeWork;
/**
 * 第二章，编码题2
 * 2.银行利率表如下表所示，请计算存款10000元，活期1年、活期2年，定期1年，定期2年后的本息合计。
 * 利率项目                        年利率（%）
 * 活期存款                         0.35
 * 三个月定期存款              1.10
 * 半年定期存款                  1.30
 * 一年定期存款                  1.50
 * 二年定期存款                  2.10
 * 
 * 对结果四舍五入，不保留小数，使用Math.round(double d)实现
 * 
 * @author Administrator
 *
 */

public class day2_code02 {
	public static void main(String[] args) {
		//本金
		int money=10000;
		
		System.out.println("活期1年，本金总计："+Math.round(money*(1+0.35/100)));
		System.out.println("活期2年，本金总计："+Math.round(money*(1+0.35/100)*(1+0.35/100)));
		System.out.println("定期1年，本金总计："+Math.round(money*(1+1.50/100)));
		System.out.println("定期2年，本金总计："+Math.round(money*(1+2.10/100)*(1+2.10/100)));
		
//		测试Math.round(double d)
//		double d=1.23;
//		Math.round(d);
//		System.out.println(Math.round(d));
//		测试平方
//		int i=5;
//		System.out.println(Math.pow(i, 2));
		
	}

}
