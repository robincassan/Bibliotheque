
public final class Video extends Document {

	private TypeSupport typeDeSupport;

	public TypeSupport getTypeDeSupport() {
		return typeDeSupport;
	}

	public void setTypeDeSupport(TypeSupport typeDeSupport) {
		this.typeDeSupport = typeDeSupport;
	}

	public Video(String titre, String nomAuteur, TypeSupport typeDeSupport) {
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

	@Override
	public boolean isEmpruntPossible() {
		return true;
	}

}
