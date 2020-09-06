class SmallCar extends Car{
	protected int seat;
	public SmallCar(String type,String way,double weight,double height,String num,int seat){
		super(type,way,weight,height,num);
		this.seat = seat ;	
	}
	public void seat(){
		System.out.println("It has "+seat+" seats.");
	}
	public void move(){
		System.out.println("It can "+way);
	}
	public void num(){
		System.out.println("Its license number is"+num);
	}	
}