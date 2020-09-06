class Robot{
	private String name;
	private int age;
	private String color;	
	public Robot(){//构造方法		
	}
	public Robot(String name,int age,String color){//构造方法
		this.name = name;
		this.age = age;
		this.color = color;
	}
	public void sayHello(){
		System.out.println("Hello!I am "+name);
	}
	public void setAge(int a){
		age = a;
	}
	public void getAge(){
		System.out.println("Hello!I am "+age);
	}
	

}