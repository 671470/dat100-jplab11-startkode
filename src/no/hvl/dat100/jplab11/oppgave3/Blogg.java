package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {

	protected Innlegg[] innleggtabell;
	protected int nesteLedige;
	// TODO: objektvariable

	public Blogg() {
		innleggtabell = new Innlegg[20];

	}

	public Blogg(int lengde) {
		innleggtabell = new Innlegg[lengde];
		nesteLedige = 0;
	}

	public int getAntall() {

		int antall = 0;
		for (int i = 0; i < innleggtabell.length; i++) {
			if (innleggtabell[i] != null)
				antall++;
		}
		return antall;

	}

	public Innlegg[] getSamling() {

		return innleggtabell;
	}

	public int finnInnlegg(Innlegg innlegg) {

		boolean funnet = false;
		int pos = 0;
		while (pos < nesteLedige && !funnet) {
			if (innleggtabell[pos].erLik(innlegg))
				funnet = true;
			else
				pos++;
		}
		if (funnet)
			return pos;
		else
			return -1;

	}

	public boolean finnes(Innlegg innlegg) {

		int pos = finnInnlegg(innlegg);
		if (pos >= 0)
			return true;
		else
			return false;

	}

	public boolean ledigPlass() {

		for (int i = 0; i < innleggtabell.length; i++) {

			if (innleggtabell[i] == null)
				return true;
		}

		return false;
	}

	public boolean leggTil(Innlegg innlegg) {

		boolean ny = finnInnlegg(innlegg) == -1;
		if (ny && nesteLedige < innleggtabell.length) {
			innleggtabell[nesteLedige] = innlegg;
			nesteLedige++;
			return true;
		} else
			return false;
	}

	public String toString() {

		String str;

		str = getAntall() + "\n";

		for (int i = 0; i < nesteLedige; i++) {
			str += innleggtabell[i].toString();
		}

		return str;
	}

	// valgfrie oppgaver nedenfor

	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}

	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());

	}

	public boolean slett(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
	}

	public int[] search(String keyword) {

		throw new UnsupportedOperationException(TODO.method());

	}
}