package no.hvl.dat100.jplab11.oppgave4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave3.*;
import java.io.FileWriter;
import java.io.IOException;
public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {

		try {
		BufferedWriter writer = new BufferedWriter(new FileWriter(mappe + filnavn));
		writer.write(samling.toString());
		writer.close();
		} catch (IOException e) {
			return false;
		}
		return true;
	}
}
