
public class Bibliotheque {

	private Document[] documents;

	public Bibliotheque() {
		this.documents = new Document[100];
	}

	// methode ajouter un document à la bibliotheque
	public void ajouterDocument(Document document) {
		for (int i = 0; i < documents.length; i++) {
			if (documents[i] == null) {
				documents[i] = document;
				break;
			}
			System.out.println("voici le nouvel élément ajouté :" + document.toString());
		}

	}

	public int getNbDocuments() {

		int sum = 0;
		for (int i = 0; i < documents.length; i++) {
			if (documents[i] != null) {
				sum++;
			}
		}
		return sum;

	}

	public int getNbDVD() {
		int sum = 0;
		for (int i = 0; i < documents.length; i++) {
			if (documents[i] != null && documents[i] instanceof Video) {
				if (((Video) documents[i]).getTypeDeSupport().equals("DVD")) {
					sum++;
				}
			}
		}
		return sum;
	}

	// afficher la bibliotheque

}
