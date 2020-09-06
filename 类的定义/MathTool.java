import java.util.*;
class MathTool{
	private final double PAI=3.14;
	private final double e=2.71;
	private final double GS=0.618;
	


	public double TriangleArea(double a,double b,double c){
	/*利用海伦公式计算三角形面积*/
		double p;
		double s=0;
		if(a+b>c&&a+c>b&&b+c>a){
			p=(a+b+c)/2;
			s=Math.sqrt(p*(p-a)*(p-b)*(p-c));
		}
		return s;//如果s等于0，说明三边不能构成三角形
	}
	


	public double V(double r,double h){
	/*求已知底面圆的半径和高的圆柱体的体积*/
		double v=0;
		if(r>0&&h>0){
			v=PAI*r*r*h;//圆柱体的体积公式
		}
		return v;//如果v为0，则说明所给的r和h不能构成圆柱体		
	}  
	

	


	public void FX(double a,double b,double c){
	/*求一元二次方程组*/
		double k=b*b-4*a*c;//求Δ的值
		double x1;
		double x2;

		if(k>0){
			x1=(-b+k)/(2*a);
			x2=(-b-k)/(2*a);
			System.out.println("x1= "+x1+"  x2= "+x2);
		}else if(k<0){
		 	System.out.println("错误");
		}else if(k==0){
			x1=-b/(2*a);
			System.out.println("x1=x2= "+x1);
		}
	}

	public void Array(double []a){
	/*给集合升序排序*/
		int ae[]={1,-1,0,2,34,78,22};
		System.out.println("排序前：");
		for(int i=0;i<ae.length;i++){System.out.print(" "+ae[i]);}
		Arrays.sort(ae);
		System.out.println("\n"+"排序后：");
		for(int i=0;i<ae.length;i++){System.out.print(" "+ae[i]);}

	}
			
}

class TestMath{//测试类
	public static void main(String []arsg){	
		MathTool s0 = new MathTool();	//新建对象
		double s=s0.TriangleArea(3,4,5);
		System.out.println("TriangleArea is "+s);//输出3，4，5围成的三角形的面积

		MathTool v0 = new MathTool();	//新建对象
		double v=v0.V(1,2);
		System.out.println("v is "+v);		//输出底面半径为1，高为2的圆柱体体积

		MathTool f= new MathTool();	//新建对象
		f.FX(1,2,1);				//调用求一元二次方程的方法s
		MathTool r = new MathTool();	//新建对象
		r.Array();		//给所定集合进行升序排序
	
	}
}