package InterfacePack;

public class Child implements Interface1, Interface2, Interface3{

	public static void main(String[] args) {
		Child C = new Child();
		C.m1();
		C.m2();
		C.m3();
		System.out.println(name);
	}

	@Override
	public void m1() {
	System.out.println("Hai Iam M1 method implemented in Child class from Interface1");
		
	}

	@Override
	public void m2() {
		System.out.println("Hai Iam M2 method implemented in Child class from Interface2");
		
	}

	@Override
	public void m3() {
		System.out.println("Hai Iam M3 method implemented in Child class from Interface3");
		
		
	}

}
