class Robot{
	private String name;
	private int age;
	private String color;	
	public Robot(){//���췽��		
	}
	public Robot(String name,int age,String color){//���췽��
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