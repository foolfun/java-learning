import java.util.*;//�����
class Great{
	public static void main (String []args){

		int ys;//����
		int cj;//�˻�
		int a;//���Լ��
		int b;//��С������

		Scanner s = new Scanner(System.in); 
		System.out.println("please input two numbers:");
		int x =s.nextInt();
   		int y =s.nextInt();
                a=qiujie(x,y);
		cj=x*y;
		b=cj/a;
		System.out.println("���Լ��:"+a);
		System.out.println("��С������:"+b);
	}
         public static int qiujie(int x,int y){
		
		int ys;
		int a;
		ys=x%y;
		while(ys!=0){

		   x=y;
		   y=ys;
		   ys=x%y;
		
		}
		ys=y;
		return ys;
	}
		

}