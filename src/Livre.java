
public class Livre extends DocumentEcrit {

	public Livre(String titre, String nomAuteur, boolean empruntPossible, int nbreDePage) {
		super(titre, nomAuteur, empruntPossible, nbreDePage);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isEmpruntPossible() {
		// TODO Auto-generated method stub
		return true;
	}

}
