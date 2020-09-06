class Fighter extends Plane{
	protected int speed;
	public Fighter(String type,String way,double weight,double height,String country,int speed)
	{
		super(type,way,weight,height,country);	
		this.speed = speed;	
	}

	public void intruduce(){
		System.out.println("It is "+type+".Its weight "+weight+"t and height is "+height+"m");
	}
	public void move(){
		System.out.println("It can "+way);
	}
	public void producer(){
		System.out.println("It is made from "+country);
	}
	public void speed(){
		System.out.println("Its speed is "+speed+"km/s");
	}	
}