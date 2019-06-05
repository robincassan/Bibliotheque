
public abstract class Document {
	private String titre;
	private String nomAuteur;
	private boolean empruntPossible;

	public Document(String titre, String nomAuteur, boolean empruntPossible) {
		super();
		this.titre = titre;
		this.nomAuteur = nomAuteur;
		this.empruntPossible = empruntPossible;
	}

	public void setEmpruntPossible(boolean empruntPossible) {
		this.empruntPossible = empruntPossible;
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

	// METHODE EMPRUNTABLE ABSTRAITE
	public abstract boolean isEmpruntPossible();

	// METHODE cout ABSTRAITE
	public abstract float cout();

	@Override
	public String toString() {
		return "Document [titre=" + titre + ", nomAuteur=" + nomAuteur + ", empruntPossible=" + empruntPossible + "]";
	}

}
