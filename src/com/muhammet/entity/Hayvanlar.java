package com.muhammet.entity;

import java.util.Scanner;

public class Hayvanlar {
	// STATE -> properties -> De�i�ken
	public String tur;
	public String ad;
	private int yasamsuresi;// g�n, saat, saniye v.s.
	private long saat;
	public int yas;
	public boolean acmi;
	public boolean asilimi;
	public int boy;
	public int agirlik;
	/**
	 * 1-> Etobur
	 *    - bal�k
	 *    - ku�
	 *    - k�rm�z� et �e�itleri
	 *    - �zel mamalar
	 * 2-> Otobur
	 *    - her t�rl� ye�il bitki
	 */
	public String beslenmesekli;
	/**
	 * 0-> uyuyor
	 * 1-> uyan�k yat�yor
	 * 2-> y�r�yor
	 * 3-> uyan�k ayakta duruyor
	 * 4-> ko�uyor
	 * 5-> dinlenme modu
	 * 6-> aktiflik
	 * 7-> h�zl� y�zme
	 */
	public int hareketdurumu;
	
	// Aksiyonlar -> Methodlar
	public void yemekYe() {
		System.out.println("Hayvan yemek yedi.");
		acmi = false;
	}
	/**
	 * 1-> Etobur
	 *    - bal�k eti
	 *    - ku� eti
	 *    - k�rm�z� et �e�itleri
	 *    - �zel etli mamalar
	 * 2-> Otobur
	 *    - her t�rl� ye�il bitki
	 * @param yemekturu
	 */
	public boolean yemekYe(String yemekturu) {
		if(beslenmesekli.equalsIgnoreCase("Otobur")) { // otobur ise ye�il bitki arar
			if(yemekturu.contains("ye�il bitki"))
				return true;
			return false;
		}else { // etobur oldu�u i�in et arayacak
			if(!yemekturu.contains("ye�il bitki"))
				return true;
			return false;
		}
	}
	
	public void asiYaptir() {
		System.out.println("Hayvana a�� yap�ld�.");
		asilimi = true;
	}
	
	public void yaslandir() {
		yasamsuresi++;
		if(yasamsuresi%365==0) {
			yas++;
			System.out.println(yas+". Do�um g�n�");
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
