package acabou;

public class Triatleta implements  Corredor , Nadador , Ciclismo {
	
	public Triatleta() {
		
	}

	@Override
	public void aquecer() {
		// TODO Auto-generated method stub
		System.out.println("está aquecendo");
	}

	@Override
	public void pedal() {
		// TODO Auto-generated method stub
		System.out.println("está pedalando");
	}

	@Override
	public void pararPedal() {
		// TODO Auto-generated method stub
		System.out.println("parou de pedalar");
	}

	@Override
	public void nadar() {
		// TODO Auto-generated method stub
		System.out.println("está nadando");
	}

	@Override
	public void pararNadar() {
		// TODO Auto-generated method stub
		System.out.println("parou de nadar");
	}

	@Override
	public void correr() {
		// TODO Auto-generated method stub
		System.out.println("esta correndo");
	}

	@Override
	public void pararCorrer() {
		// TODO Auto-generated method stub
		System.out.println("parou de correr");
	}

}
