
public class Periodique extends Livre {

	private String numero;

	public Periodique(String titre, String nomAuteur, int nbreDePage, String numero) {
		super(titre, nomAuteur, false, nbreDePage);
		this.numero = numero;
		// TODO Auto-generated constructor stub
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

}
