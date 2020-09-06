abstract class B implements A{
	public void id(){
		System.out.println("id : "+id);
	}
	public void say(){
		System.out.println("Hi");
	}
	abstract public void move();
}