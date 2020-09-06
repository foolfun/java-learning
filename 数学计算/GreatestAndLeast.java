import java.util.*; //导入相关的包
/**
这个类包含了两个方法：一个是驱动函数main,另一个是数学函数greatestCD
其中数学函数greatestCD是一个计算两个数最大公约数的方法；
*/
class GreatestAndLeast{//这是一个驱动类
	public static void main(String []args){

		int x;//被除数
		int y;//除数
		int remainder;//余数
		int product;//乘积
		int gcd;//Greatest common divisor
		int lcm;//Least common multiple
		Scanner sc = new Scanner(System.in);//新建输入对象
		x = sc.nextInt();//输入整数x
		y = sc.nextInt();//输入整数y
		product = x*y;//求积
		gcd = greatestCD(x,y);//调用函数
		lcm = product/gcd;//求得最小公倍数
		System.out.println("gcd is:"+gcd);
		System.out.println("lcm is:"+lcm);

	}
	public static int greatestCD(int x,int y){
		int remainder;//余数		
		int gcd;//Greatest common divisor		
		remainder = x%y;//求余
		while(remainder!=0){
			x = y;
			y = remainder;
			remainder = x%y;
		}
		gcd = y;//求得最大公约数
		return gcd;//返回最大公约数
	}
}