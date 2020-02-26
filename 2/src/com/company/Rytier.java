package com.company;

public class Rytier implements Energia {
	private int energia;
	private int pridavnaEnergia;
	
	private Mec mec;

	public void nastavEnergiu(int energia) {
		this.energia = energia;
	}
	public void zvysEnergiu(int energia) {
		this.energia += energia;
	}
	public void znizEnergiu(int energia) {
		this.energia -= energia;
	}
	public int zistiEnergiu() {
		return energia + pridavnaEnergia;
	}

	public Rytier(int energia) {
		nastavEnergiu(energia);
	}
	public Rytier(int energia, Mec mec) {
		nastavEnergiu(energia);
		this.mec = mec;
	}

	void utok(Obor obor) {
		nastavEnergiu((int) (0.9 * obor.zistiEnergiu()));
		obor.odveta(this); // this predstavuje odkaz na aktualny objekt rytiera  
	}
	
	public int ukazMec() {
		return mec.zistiVyrobneCislo();
	}
}


