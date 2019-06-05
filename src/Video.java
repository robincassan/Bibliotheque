
public final class Video extends Document {

	private String typeDeSupport;

	public String getTypeDeSupport() {
		return typeDeSupport;
	}

	public void setTypeDeSupport(String typeDeSupport) {
		this.typeDeSupport = typeDeSupport;
	}

	public Video(String titre, String nomAuteur, String typeDeSupport) {
		super(titre, nomAuteur, true);
		this.typeDeSupport = typeDeSupport;

	}

	@Override
	public float cout() {
		// TODO Auto-generated method stub
		return 70.0f;
	}

	public float coutvid() {
		return 70.0f;

	}

}
