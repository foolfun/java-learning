abstract class Plane implements Vehicle{
	protected String type;
	protected String way;
	protected double weight;
	protected double height;
	protected String country;
	public Plane(String type,String way,double weight,double height,String country)
	{
		this.type = type;
		this.way = way;
		this.weight = weight;
		this.height = height;
		this.country = country;	
	}
	abstract public void intruduce();
	abstract public void move();
	abstract public void producer();
}