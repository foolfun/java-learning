class Student{
	private String name;
	private int age;
	private String sex;
	private int number;
	private int cla;
	public Student(){
	}
	public Student(String name,int age,int number,int cla){
		this.name=name;
		this.age=age;
		this.sex=sex;
		this.number=number;
		this.cla=cla;
	}
	public void sayhi(){
		System.out.println("Hi!I am "+name);
	}
	
	public void introduce(){
		if(number!=0){
			if(number%2==0){
				sex="girl";
			}else{
				sex="boy";
		}
	}else{
		sex="girl";
	}
		
		System.out.println("I am a "+sex+" my number is "+number);
	}
	public void ac(){
		System.out.println("My age is "+age+" and I am in class "+cla);
	}	
	
}