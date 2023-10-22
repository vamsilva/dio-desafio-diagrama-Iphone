package aparelhoTelefonico;

public class AparelhoTelefonico implements TelefoneInterface  {
	
	private int numero;
	
	public void ligar() {
		System.out.println("Ligando...");
	}
	
	public void atender() {
		System.out.println("Atendendo");
	}
}
