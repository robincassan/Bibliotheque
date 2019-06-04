
public abstract class Document {
	private String titre;
	private String nomAuteur;

	public Document(String titre, String nomAuteur) {
		super();
		this.titre = titre;
		this.nomAuteur = nomAuteur;

	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getNomAuteur() {
		return nomAuteur;
	}

	public void setNomAuteur(String nomAuteur) {
		this.nomAuteur = nomAuteur;
	}

}
