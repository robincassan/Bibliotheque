
public class Periodique extends Document {

	private String numero;

	public Periodique(String titre, String nomAuteur, String numero) {
		super(titre, nomAuteur);
		this.numero = numero;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

}
