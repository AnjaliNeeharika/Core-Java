package MultiLevelInheritance;

public class JnNTR extends HariKrishna{
	
	void jntr()
	{
		System.out.println("Hai I am Son of Harikrishna");
	}

	
	public static void main(String[] args)
	{
		JnNTR J = new JnNTR();
		J.sntr();
		
		SnNTR S = new SnNTR();
		S.lax();
	}
}
