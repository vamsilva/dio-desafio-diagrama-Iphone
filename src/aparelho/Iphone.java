package aparelho;

import aparelhoTelefonico.TelefoneInterface;
import navegadorInternet.NavegadorInterface;
import reprodutoMusical.ReprodutorInterface;


public class Iphone implements ReprodutorInterface,NavegadorInterface,TelefoneInterface{

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
	
	public void abrirPagina() {
		System.out.println("Abrindo página...");
	}
	
	public void atualizarPagina() {
		System.out.println("Atualizando página...");
	}
	
	public void fecharPagina() {
		System.out.println("Fechando página...");
	}
	
	public void ligar() {
		System.out.println("Ligando...");
	}
	
	public void atender() {
		System.out.println("Atendendo");
	}
}
