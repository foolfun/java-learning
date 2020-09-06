public class Test{	
	public static void main(String []args){
		Cart cart = new Cart("cart","run",2,2.5,"Ãöjk12345","bule");
		cart.intruduce();
		cart.move();
		cart.num();
		cart.color();
		System.out.println("\n");
		SmallCar smallcar = new SmallCar("smallcar","run",1.5,1.5,"¾©jk12345",4);
		smallcar.intruduce();
		smallcar.move();
		smallcar.num();
		smallcar.seat();
		System.out.println("\n");
		Fighter fighter = new Fighter("fighter","fly",20,20,"China",7);
		fighter.intruduce();
		fighter.move();
		fighter.producer();
		fighter.speed();
		System.out.println("\n");		
		PrivatePlane plane = new PrivatePlane("PrivatePlane","fly",20,20,"China",100);
		plane.intruduce();
		plane.move();
		plane.producer();
		plane.people();

	}


}