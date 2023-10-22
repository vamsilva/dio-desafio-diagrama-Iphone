package reprodutoMusical;

public class ReprodutorMusical implements ReprodutorInterface {
	
	private String musica;
	private String artista;
	
	public void pesquisarMusica() {
		System.out.println("Pesquisando musica...");
	}
	
	public void pesquisarArtista() {
		System.out.println("Pesquisando artista...");
	}
	
	public void tocarMusica() {
		System.out.println("Tocando musica...");
	}
	
	public void pausarMusica() {
		System.out.println("Musica pausada..");
	}
}
