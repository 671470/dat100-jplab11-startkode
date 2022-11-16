package no.hvl.dat100.jplab11.oppgave1;

import no.hvl.dat100.jplab11.common.TODO;

public abstract class Innlegg {

	protected int id;
	protected String bruker;
	protected String dato;
	protected int likes;

	public Innlegg() {

	}

	public Innlegg(int id, String bruker, String dato) {

		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes = 0;
	}

	public Innlegg(int id, String bruker, String dato, int likes) {

		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes = likes;
	}

	public String getBruker() {

		return bruker;

	}

	public void setBruker(String bruker) {
		this.bruker = bruker;
	}

	public String getDato() {

		return dato;

	}

	public void setDato(String dato) {
		this.dato = dato;
	}

	public int getId() {

		return id;

	}

	public int getLikes() {

		return likes;
	}

	public void doLike() {

		this.likes = likes + 1;

	}

	public boolean erLik(Innlegg innlegg) {

		boolean lik = false;
		if (innlegg == null)
			return lik;
		if (!(innlegg instanceof Innlegg))
			return lik;
		Innlegg p = (Innlegg) innlegg;
		if (this.getId() != p.getId())
			return lik;
		if (this.getId() == p.getId())
			lik = true;
		return lik;

	}


	@Override
	public String toString() {

		return getId() + "\n" + getBruker() + "\n" + getDato() + "\n" + getLikes() + "\n";

	}

	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {

		throw new UnsupportedOperationException(TODO.method());

	}
}
