package com.company;

public class ZlyObor extends Obor {
//	boolean hladny; // pozor na skryvanie atributov!
	
	void odveta(Rytier rytier) {
		if (hladny)
			zjedz(rytier);
	}
	void zjedz(Rytier rytier) {
		rytier.nastavEnergiu(0);
	}
}
