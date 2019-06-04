
public class Video extends Document {

	private String typeDeSupport;

	public String getTypeDeSupport() {
		return typeDeSupport;
	}

	public void setTypeDeSupport(String typeDeSupport) {
		this.typeDeSupport = typeDeSupport;
	}

	public Video(String titre, String nomAuteur, String typeDeSupport) {
		super(titre, nomAuteur);
		this.typeDeSupport = typeDeSupport;

	}

}
