package br.com.limas;

public class OlaMundo {

	private final long id;
	private final String contente;

	public OlaMundo(long id, String contente) {

		this.id = id;
		this.contente = contente;
	}

	public long getId() {
		return id;
	}

	public String getContente() {
		return contente;
	}

}
