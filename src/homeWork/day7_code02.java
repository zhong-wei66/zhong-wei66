package homeWork;

/**
 * �����£�������2
 *  ��ȡ�������ֵ����Сֵ������
 *  ����Java��Math���random()��������д�����õ�0��n֮����������n�ǲ�����
 *  ���ҳ�����50������������������ġ���С��������ͳ������>=60���ж��ٸ���
 *  ��ʾ��ʹ�� int num=(int)(n*Math.random());��ȡ�����
 * @author Administrator
 *
 */
class randomNum{
	//����50�������
	int[] numArray = new int[50];

	
	//����50��0��n֮��������
	public void number(int n) {
		
		for (int i = 0; i < numArray.length; i++) {
			int num = (int)(n*Math.random());
			numArray[i] = num;
			System.out.println(numArray[i]);
		}			
	}
	
	//ð�������ҵ���Сֵ�����ֵ
	public void bubbleMaxMin() {
		//�������temp��Ϊ�м���������ڽ�����������ֵ
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
		System.out.println("��Сֵ��"+numArray[0]);
		System.out.println("���ֵ��"+numArray[numArray.length-1]);
	}
	
	//��>=60�ĸ���
	public void amount() {
		int i=0;
		for (int j = 0; j < numArray.length; j++) {
			if (numArray[j] >= 60) {
				i++;
			}
		}
		System.out.println("���ڵ���60�ĸ����ǣ�" + i);
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
