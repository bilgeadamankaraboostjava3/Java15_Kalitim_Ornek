package com.muhammet;

import com.muhammet.entity.Kedi;

public class Runner {

	public static void main(String[] args) {
		
		Kedi kedi = new Kedi();
		for(int i=0;i<(24*365);i++) {
			System.out.println("Ge�en saat..: "+ (i+1)+ " saat ge�ti");
			kedi.beslenmesekli = "Etobur";
			kedi.ad ="Tekir";
			kedi.agirlik = 600;
			kedi.boy= 45;
			kedi.kuyrukuzunlugu= 25;
			kedi.birsaat();		
		}
		System.out.println("Kedinin ya��...: "+ kedi.yas);
	}

}
