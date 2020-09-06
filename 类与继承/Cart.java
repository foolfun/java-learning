class Cart extends Car{
	protected String color;
	public Cart(String type,String way,double weight,double height,String num,String color){
		super(type,way,weight,height,num);
		this.color = color ;	
	}
	public void move(){
		System.out.println("It can "+way);
	}
	public void num(){
		System.out.println("Its license number is"+num);
	}
	public void color(){
		System.out.println("It is "+color);
	}
}