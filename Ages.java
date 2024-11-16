package MethodOverLoading;

public class Ages {
	
	void city()
	{
		System.out.println("Hai I am City Method");
		
	}
	
	
	void city(int a)
	{
		System.out.println("Hai I am City Method with one Int parameter");
	}
	
	void city(String b)
	{
		System.out.println("Hai I am City Method with one String parameter");
	}
	
	
	void city(String b, int a)
	{
		System.out.println("Hai I am City Method with two String and Int parameter");
	}
	
	void city(int b, String a)
	{
		System.out.println("Hai I am City Method with two int and string parameter");
	}

	public static void main(String[] args) {
		Ages A = new Ages();
		A.city(123, "Abc");
		
		A.city(67);

	}

}
