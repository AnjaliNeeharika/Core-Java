package SingleInheritance;

public class ClassB extends ClassA{
	
	String u = "Hyderabad";

	public static void main(String[] args) {
		
		ClassB B = new ClassB();
		
		System.out.println("The Parent P value is : "+B.p);
		System.out.println("The Child U value is : " +B.u);
		
		B.name();
		

	}

}
