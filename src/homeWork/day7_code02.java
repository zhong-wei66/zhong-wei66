package homeWork;

/**
 * 第七章，编码题2
 *  获取数组最大值和最小值操作：
 *  利用Java的Math类的random()方法，编写函数得到0到n之间的随机数，n是参数。
 *  并找出产生50个这样的随机数中最大的、最小的数，并统计其中>=60的有多少个。
 *  提示：使用 int num=(int)(n*Math.random());获取随机数
 * @author Administrator
 *
 */
class randomNum{
	//储存50个随机数
	int[] numArray = new int[50];

	
	//生成50个0到n之间的随机数
	public void number(int n) {
		
		for (int i = 0; i < numArray.length; i++) {
			int num = (int)(n*Math.random());
			numArray[i] = num;
			System.out.println(numArray[i]);
		}			
	}
	
	//冒泡排序找到最小值和最大值
	public void bubbleMaxMin() {
		//定义变量temp作为中间变量，用于交换两个数的值
		int temp;
		for (int i = 0; i < numArray.length; i++) {
			for (int j = 0; j < numArray.length-1-i; j++) {
				if (numArray[j]>numArray[j+1]) {
					temp = numArray[j];
					numArray[j] = numArray[j+1];
					numArray[j+1] = temp;
				}
			}
		}
		System.out.println("最小值："+numArray[0]);
		System.out.println("最大值："+numArray[numArray.length-1]);
	}
	
	//求>=60的个数
	public void amount() {
		int i=0;
		for (int j = 0; j < numArray.length; j++) {
			if (numArray[j] >= 60) {
				i++;
			}
		}
		System.out.println("大于等于60的个数是：" + i);
	}

}


public class day7_code02 {
	public static void main(String[] args) {
		randomNum rnumber = new randomNum();
		rnumber.number(100);
		rnumber.bubbleMaxMin();
		rnumber.amount();
		
	}

}
