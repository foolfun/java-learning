class PrivatePlane extends Plane{
	protected int peoplenum;
	public PrivatePlane(String type,String way,double weight,double height,String country,int peoplenum)
	{
		super(type,way,weight,height,country);	
		this.peoplenum = peoplenum;	
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
	public void people(){
		System.out.println("It can hold "+peoplenum);
	}	
}