
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Livre livre = new Livre("JAVA", "CASSAN", true, 330);
		Video film = new Video("DIKENEK", "François DAMIEN", TypeSupport.DVD);
		Periodique revue = new Periodique("La revue JAVA", "Mattieu RACINE", 15, "isbn15223541");
		Video film1 = new Video("avengers", "tony stark", TypeSupport.DVD);

		System.out.println(livre.cout());
		System.out.println(revue.cout());
		System.out.println(film1.cout());

		// System.out.println(page.isEmpruntPossible());
		// System.out.println(livre.isEmpruntPossible());
		// System.out.println(revue.isEmpruntPossible());.
		// System.out.println(film1.isEmpruntPossible());

		Bibliotheque bibliotheque = new Bibliotheque();

		bibliotheque.ajouterDocument(livre);
		bibliotheque.ajouterDocument(film);
		bibliotheque.ajouterDocument(film1);
		bibliotheque.ajouterDocument(revue);

		System.out.println("Nombre de documents : " + bibliotheque.getNbDocuments());
		System.out.println("Nombre de DVD : " + bibliotheque.getNbDVD());

	}

}
