package com.semairem;

public class Program {

	public static void main(String[] args) {
		GaleriDukkanlari galeriDukkanlari =new GaleriDukkanlari();
		galeriDukkanlari.adi="BEREKET GALERİ";
		galeriDukkanlari.boyutu=250;
		galeriDukkanlari.kirasi=5000;
		galeriDukkanlari.galerideBulunanAraclarinTuru="otomobil";
		galeriDukkanlari.acilisYili=2001;
		
		System.out.println("1.Galerinin Bilgileri");
		System.out.println(" ");
		galeriDukkanlari.acilisSaati();
		galeriDukkanlari.kapanisSaati();
		System.out.println("Galeri Dükkanının Adı "+galeriDukkanlari.adi);
		System.out.println("Galeri Dükkanının Boyutu "+galeriDukkanlari.boyutu+" metrekare");
		System.out.println("Galeri Dükkanının Kirası "+galeriDukkanlari.kirasi);
		System.out.println("Galeri Dükkanının Açılış Yılı "+galeriDukkanlari.acilisYili);
		System.out.println("Galeri Dükkanınında Bulunan Araçların Türü "+galeriDukkanlari.galerideBulunanAraclarinTuru);

		GaleriDukkanlari galeriDukkanlari1=new GaleriDukkanlari();
		galeriDukkanlari1.adi="ŞANS GALERİ";
		galeriDukkanlari1.boyutu=375;
		galeriDukkanlari1.kirasi=9000;
		galeriDukkanlari1.galerideBulunanAraclarinTuru="Motor";
		galeriDukkanlari1.acilisYili=1987;
		
		System.out.println(" ");
		
		System.out.println("2.Galerinin Bilgileri");
		System.out.println(" ");
		galeriDukkanlari1.acilisSaati();
		galeriDukkanlari1.kapanisSaati();
		System.out.println("Galeri Dükkanının Adı "+galeriDukkanlari1.adi);
		System.out.println("Galeri Dükkanının Boyutu "+galeriDukkanlari1.boyutu+" metrekare");
		System.out.println("Galeri Dükkanının Kirası "+galeriDukkanlari1.kirasi);
		System.out.println("Galeri Dükkanının Açılış Yılı "+galeriDukkanlari1.acilisYili);
		System.out.println("Galeri Dükkanınında Bulunan Araçların Türü "+galeriDukkanlari1.galerideBulunanAraclarinTuru);
		

		GiyimDukkanlari giyimDukkanlari=new GiyimDukkanlari();
		giyimDukkanlari.adi="Fındık Butik";
		giyimDukkanlari.boyutu=90;
		giyimDukkanlari.kirasi=1500;
		giyimDukkanlari.acilisYili=2017;
		giyimDukkanlari.giysileriKullananlarinCisiyeti="Kadın";
		
System.out.println(" ");
		
		System.out.println("1.Giyim Dükkanının Bilgileri");
		System.out.println(" ");
		giyimDukkanlari.acilisSaati();
		giyimDukkanlari.kapanisSaati();
		System.out.println("Giyim Dükkanının Adı "+giyimDukkanlari.adi);
		System.out.println("Giyim Dükkanının Boyutu "+giyimDukkanlari.boyutu+" metrekare");
		System.out.println("Giyim Dükkanının Kirası "+giyimDukkanlari.kirasi);
		System.out.println("Giyim Dükkanının Açılış Yılı "+giyimDukkanlari.acilisYili);
		System.out.println("Giyim Dükkanınında Bulunan Giysileri Kullanacak İnsan(ların)ın Cinsiyeti "+giyimDukkanlari.giysileriKullananlarinCisiyeti);
		
		YemekDukkanlari yemekDukkanlari=new YemekDukkanlari();
		yemekDukkanlari.adi="GelDoyurGit";
		yemekDukkanlari.boyutu=160;
		yemekDukkanlari.kirasi=2650;
		yemekDukkanlari.acilisYili=2001;
		yemekDukkanlari.servisi="Self";
		yemekDukkanlari.yemeklerinTuru="Ev & Hamur işi Yemekleri";
		
System.out.println(" ");
		
		System.out.println("1.Yemek Dükkanının Bilgileri");
		System.out.println(" ");
		yemekDukkanlari.acilisSaati();
		yemekDukkanlari.kapanisSaati();
		System.out.println("Yemek Dükkanının Adı "+yemekDukkanlari.adi);
		System.out.println("Yemek Dükkanının Boyutu "+yemekDukkanlari.boyutu+" metrekare");
		System.out.println("Yemek Dükkanının Kirası "+yemekDukkanlari.kirasi);
		System.out.println("Yemek Dükkanının Açılış Yılı "+yemekDukkanlari.acilisYili);
		System.out.println("Yemek Dükkanınında Kullanılan Servis Türü "+yemekDukkanlari.servisi);
		System.out.println("Yemek Dükkanınında Bulunan Yemekleri Türü "+yemekDukkanlari.yemeklerinTuru);

	}

}

