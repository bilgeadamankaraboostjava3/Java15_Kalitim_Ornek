package com.muhammet.entity;

public class Kedi extends Hayvanlar{

	public int kuyrukuzunlugu;
	/**
	 * kediler 9 canlýdýr.
	 */
	public int can=9;
	
	public void canEksilt() {
		if(can>0)
			can--;
	}
	
	public void fareKovala() {
		hareketdurumu = 4;
	}
}
