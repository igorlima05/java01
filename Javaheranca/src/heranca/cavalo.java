package heranca;

public class cavalo extends Animal{
	public cavalo(String nome) {
		super(nome);
	}
	
	public void comer(String comida) {
		System.out.printf("foi comer %S",comida);
	}
	public void comer(String estado,String comida) {
		System.out.printf("%S foi coimer %S e ficou %S",nome,comida,estado);
	}
}
