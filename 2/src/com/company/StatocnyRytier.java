package com.company;

public class StatocnyRytier extends Rytier {

	public StatocnyRytier(int energia) {
		super(energia);
	}
	public StatocnyRytier(int energia, Mec mec) {
		super(energia, mec);
	}
	void utok(Obor obor) {
		obor.nastavEnergiu(0);
		// bez odvety
	}
}

