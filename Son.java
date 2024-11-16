package SuperVsThis;

public class Son extends Father {
	
	String name = "Yogesh";
	
	void checkname()
	{
		String name = "Rajesh";
		System.out.println("The Father name is : " +super.name);  //accessing the parent name
		System.out.println("The Son name is : " +this.name);   //accessing the child name
		System.out.println("The Local Name is : " +name);
		super.m1();
		//super(); //Constructor call must be the first statement in a constructor
		
	}
	
	Son()
	{
		super.m1();
		System.out.println(super.name);
	}
	
	

	public static void main(String[] args) {
		Son S = new Son();
		S.checkname();

	}

}
