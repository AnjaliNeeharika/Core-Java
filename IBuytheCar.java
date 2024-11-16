package AbstractionPack;

public class IBuytheCar extends CartoBuy{   //child extends parent
	  
	

	public static void main(String[] args) {
		IBuytheCar I = new IBuytheCar();
		I.tyres();   //parent
		I.color();   //child override from parent
		I.fuel();    //child override from parent
		I.brand();   //child override from parent

	}

	@Override
	void color() {
		System.out.println("I bought dual tone");
		
	}

	@Override
	void fuel() {
		System.out.println("pertol used fuel");
		
	}

	@Override
	void brand() {
		System.out.println("I bought I20");
		
	}

}
