package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Cone;

public class Stock extends Cone {

	private int iceRockets;
	private int cones;
	private int balls;
	private int magni;

	public int getIceRockets() {
		return iceRockets;
	}

	public void setIceRockets(int iceRockets) {
		this.iceRockets = iceRockets;
	}

	public int getCones() {

		return cones;
	}

	public void setCones(int cones) {
		this.cones = cones;
	}

	public int getballs() {
		return balls;
		
	}

	public void setBalls(int balls) {
		this.balls = balls;
	}

	public int getMagni() {
		return magni;
	}

	public void setMagni(int magni) {
		this.magni = magni;
	}

}
