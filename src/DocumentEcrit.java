
public class DocumentEcrit extends Document {
	private int nbreDePage;

	public DocumentEcrit(String titre, String nomAuteur, boolean empruntPossible, int nbreDePage) {
		super(titre, nomAuteur, empruntPossible);
		this.nbreDePage = nbreDePage;
		// TODO Auto-generated constructor stub
	}

	public int getNbreDePage() {
		return nbreDePage;
	}

	public void setNbreDePage(int nbreDePage) {
		this.nbreDePage = nbreDePage;
	}

// Calcul du cout du document écrit
	/*
	 * public float coutdc() { return this.getNbreDePage() * 0.5f; }
	 */
	@Override
	public float cout() {
		// TODO Auto-generated method stub
		return this.getNbreDePage() * 0.5f;
	}

	// possibilité d'emprunt

}
