package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Cone;

public class Stock {

	int iceRockets = 100;
	int cones = 300;
	int balls = 1000;
	int magni = 50;
		
	public Stock() {
		super();
	}
	public Stock(int iceRockets, int cones, int balls, int magni) {
		super();
		this.iceRockets = iceRockets;
		this.cones = cones;
		this.balls = balls;
		this.magni = magni;
	}
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
	public int getBalls() {
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
