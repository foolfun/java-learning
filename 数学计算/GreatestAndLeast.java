import java.util.*; //������صİ�
/**
��������������������һ������������main,��һ������ѧ����greatestCD
������ѧ����greatestCD��һ���������������Լ���ķ�����
*/
class GreatestAndLeast{//����һ��������
	public static void main(String []args){

		int x;//������
		int y;//����
		int remainder;//����
		int product;//�˻�
		int gcd;//Greatest common divisor
		int lcm;//Least common multiple
		Scanner sc = new Scanner(System.in);//�½��������
		x = sc.nextInt();//��������x
		y = sc.nextInt();//��������y
		product = x*y;//���
		gcd = greatestCD(x,y);//���ú���
		lcm = product/gcd;//�����С������
		System.out.println("gcd is:"+gcd);
		System.out.println("lcm is:"+lcm);

	}
	public static int greatestCD(int x,int y){
		int remainder;//����		
		int gcd;//Greatest common divisor		
		remainder = x%y;//����
		while(remainder!=0){
			x = y;
			y = remainder;
			remainder = x%y;
		}
		gcd = y;//������Լ��
		return gcd;//�������Լ��
	}
}