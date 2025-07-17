package exerciciosencapsulamento;

public class competicao  {
	public static void main(String[] args) {
		
		corredor c1 = new corredor("pedro", 24);
		c1.correr();
		c1.parar_correr();
	
		nadador n1 = new nadador("andré",15);
		n1.nadar();
		n1.parou_nadar();
		
		ciclismo ci1 = new ciclismo("igor", 24);
		ci1.pedal();
		ci1.parou_pedal();
		
}
}