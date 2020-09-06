import java.util.*;//导入包
class Great{
	public static void main (String []args){

		int ys;//余数
		int cj;//乘积
		int a;//最大公约数
		int b;//最小公倍数

		Scanner s = new Scanner(System.in); 
		System.out.println("please input two numbers:");
		int x =s.nextInt();
   		int y =s.nextInt();
                a=qiujie(x,y);
		cj=x*y;
		b=cj/a;
		System.out.println("最大公约数:"+a);
		System.out.println("最小公倍数:"+b);
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