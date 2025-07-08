package heranca;

public class Fazenda {
	public static void main(String[]args) {
		cavalo c1 = new cavalo("Don toro");
		
		c1.comer();
		c1.comer("capim");
		c1.comer("triste","capim");
	}

}
