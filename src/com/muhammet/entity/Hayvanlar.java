package com.muhammet.entity;

import java.util.Scanner;

public class Hayvanlar {
	// STATE -> properties -> Deðiþken
	public String tur;
	public String ad;
	private int yasamsuresi;// gün, saat, saniye v.s.
	private long saat;
	public int yas;
	public boolean acmi;
	public boolean asilimi;
	public int boy;
	public int agirlik;
	/**
	 * 1-> Etobur
	 *    - balýk
	 *    - kuþ
	 *    - kýrmýzý et çeþitleri
	 *    - özel mamalar
	 * 2-> Otobur
	 *    - her türlü yeþil bitki
	 */
	public String beslenmesekli;
	/**
	 * 0-> uyuyor
	 * 1-> uyanýk yatýyor
	 * 2-> yürüyor
	 * 3-> uyanýk ayakta duruyor
	 * 4-> koþuyor
	 * 5-> dinlenme modu
	 * 6-> aktiflik
	 * 7-> hýzlý yüzme
	 */
	public int hareketdurumu;
	
	// Aksiyonlar -> Methodlar
	public void yemekYe() {
		System.out.println("Hayvan yemek yedi.");
		acmi = false;
	}
	/**
	 * 1-> Etobur
	 *    - balýk eti
	 *    - kuþ eti
	 *    - kýrmýzý et çeþitleri
	 *    - özel etli mamalar
	 * 2-> Otobur
	 *    - her türlü yeþil bitki
	 * @param yemekturu
	 */
	public boolean yemekYe(String yemekturu) {
		if(beslenmesekli.equalsIgnoreCase("Otobur")) { // otobur ise yeþil bitki arar
			if(yemekturu.contains("yeþil bitki"))
				return true;
			return false;
		}else { // etobur olduðu için et arayacak
			if(!yemekturu.contains("yeþil bitki"))
				return true;
			return false;
		}
	}
	
	public void asiYaptir() {
		System.out.println("Hayvana aþý yapýldý.");
		asilimi = true;
	}
	
	public void yaslandir() {
		yasamsuresi++;
		if(yasamsuresi%365==0) {
			yas++;
			System.out.println(yas+". Doðum günü");
		}
	}
	
	public void birsaat() {
		saat++;
		if(saat%24==0)
			yaslandir();
		acikmismi();
	}
	
	public void acikmismi() {
		if(saat%3==0) {
			acmi = true;
			Scanner sc = new Scanner(System.in);
			System.out.print("yemek yedirmek istiyor musunuz..:[E/H] ");
			String EH = sc.nextLine();
			if(EH.equals("E"))
				yemekYe();
		}else {
			acmi = false;
		}
	}

}
