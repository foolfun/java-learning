import java.util.*;
class MathTool{
	private final double PAI=3.14;
	private final double e=2.71;
	private final double GS=0.618;
	


	public double TriangleArea(double a,double b,double c){
	/*���ú��׹�ʽ�������������*/
		double p;
		double s=0;
		if(a+b>c&&a+c>b&&b+c>a){
			p=(a+b+c)/2;
			s=Math.sqrt(p*(p-a)*(p-b)*(p-c));
		}
		return s;//���s����0��˵�����߲��ܹ���������
	}
	


	public double V(double r,double h){
	/*����֪����Բ�İ뾶�͸ߵ�Բ��������*/
		double v=0;
		if(r>0&&h>0){
			v=PAI*r*r*h;//Բ����������ʽ
		}
		return v;//���vΪ0����˵��������r��h���ܹ���Բ����		
	}  
	

	


	public void FX(double a,double b,double c){
	/*��һԪ���η�����*/
		double k=b*b-4*a*c;//�󦤵�ֵ
		double x1;
		double x2;

		if(k>0){
			x1=(-b+k)/(2*a);
			x2=(-b-k)/(2*a);
			System.out.println("x1= "+x1+"  x2= "+x2);
		}else if(k<0){
		 	System.out.println("����");
		}else if(k==0){
			x1=-b/(2*a);
			System.out.println("x1=x2= "+x1);
		}
	}

	public void Array(double []a){
	/*��������������*/
		int ae[]={1,-1,0,2,34,78,22};
		System.out.println("����ǰ��");
		for(int i=0;i<ae.length;i++){System.out.print(" "+ae[i]);}
		Arrays.sort(ae);
		System.out.println("\n"+"�����");
		for(int i=0;i<ae.length;i++){System.out.print(" "+ae[i]);}

	}
			
}

class TestMath{//������
	public static void main(String []arsg){	
		MathTool s0 = new MathTool();	//�½�����
		double s=s0.TriangleArea(3,4,5);
		System.out.println("TriangleArea is "+s);//���3��4��5Χ�ɵ������ε����

		MathTool v0 = new MathTool();	//�½�����
		double v=v0.V(1,2);
		System.out.println("v is "+v);		//�������뾶Ϊ1����Ϊ2��Բ�������

		MathTool f= new MathTool();	//�½�����
		f.FX(1,2,1);				//������һԪ���η��̵ķ���s
		MathTool r = new MathTool();	//�½�����
		r.Array();		//���������Ͻ�����������
	
	}
}