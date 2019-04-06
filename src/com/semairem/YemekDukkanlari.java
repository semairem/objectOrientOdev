package com.semairem;

public class YemekDukkanlari extends Dukkan{
	String yemeklerinTuru;
	String servisi;
	
	@Override
	void acilisSaati() {
		System.out.println("Sabah 06:30'da Dükknımı açarım");
	}
	@Override
	void kapanisSaati() {

		System.out.println("Akşam 20:45'de Dükkanımı kapatırım");
	}

}
