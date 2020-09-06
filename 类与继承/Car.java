abstract class Car implements Vehicle{
	protected String type;
	protected String way;
	protected double weight;
	protected double height;
	protected String num;
	public Car(String type,String way,double weight,double height,String num){
		this.type = type;
		this.way = way;
		this.weight = weight;
		this.height = height;
		this.num = num ;
	}

	public void intruduce(){
		System.out.println("It is "+type+".Its weight "+weight+"t and height is "+height+"m");
	}
	abstract public void move();
	abstract public void num();
	
}