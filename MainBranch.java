package WithoutInheritance;

public class MainBranch {

	public static void main(String[] args) {
		
		System.out.println("----Abids Branch Data ----");
		AbidsBranch A = new AbidsBranch();
		A.stdcount  = 78;
		A.name = "ABIDS B";
		A.address  = "Near Metro";
		A.data();
		
		
		System.out.println("----Koti Branch Data ----");
		KotiBranch K = new KotiBranch();
		K.stdcount  = 45;
		K.name = "CODE KOTI";
		K.address  = "Near Womens college";
		K.data();
		

	}

}
