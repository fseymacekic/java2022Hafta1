package javaHafta1;

public class Main {

	public static void main(String[] args) {
		
		// Java Dersi 5
		System.out.println("Hello World!");
		
		System.out.println("--------------------");
		
		// Java Dersi 6: Değişkenler
		int sayi = 10;
		String mesaj = "Öğrenci Sayısı: ";
		System.out.println(mesaj + sayi);
		
		System.out.println("--------------------");
		
		// Java Dersi 7: Temel Veri Tipleri
		double sayiDouble = 12.5;
		char karakter = 'A';
		boolean dogruMu = false;
		
		System.out.println("--------------------");
		
		// Java Dersi 8: If Blokları
		int deger = 20;
		if (deger < 20) {
			System.out.println("Sayı 20 den küçük");
		}else if (deger == 20){
			System.out.println("Sayı 20 ye eşittir");
		}else System.out.println("Sayı 20 den büyük");

		System.out.println("--------------------");
		
		// Java Dersi 10: Switch Blokları
		char grade = 'C';
		switch(grade) {
			case 'A':
				System.out.println("Mükemmel : Geçtiniz");
				break;
			case 'B':
				System.out.println("Çok Güzel : Geçtiniz");
				break;
			case 'C':
				System.out.println("İyi : Geçtiniz");
				break;
			case 'D':
				System.out.println("Fena Değil : Geçtiniz");
				break;
			case 'F':
				System.out.println("Maalesef Kaldınız");
				break;
				default: 
					System.out.println("Geçersiz Not Girdiniz!");
		}
		
		System.out.println("--------------------");
		
		// Java Dersi 11: For Döngüsü
		for(int i=1;i<10;i++){
			System.out.println(i);
		}
		System.out.println("For Döngüsü Bitti");
		
		System.out.println("--------------------");

		// Java Dersi 12: While Döngüsü
		int i = 1;
		while(i<10)	{			
			System.out.println(i);
			i+=2;
		}
		System.out.println("While Döngüsü Bitti");
		
		System.out.println("--------------------");
		
		// Java Dersi 13: Do-While Döngüsü
		int j = 1;
		do {
			System.out.println(j);
			j+=3;
		}while(j<10);
			System.out.println("Do-While Döngüsü Bitti");
			
		System.out.println("--------------------");

		// Java Dersi 14: Diziler
		String[] ogrenciler = new String[3];
		ogrenciler[0] = "Engin";
		ogrenciler[1] = "Derin";
		ogrenciler[2] = "Salih";
		
		for(int ogr=0;ogr<ogrenciler.length;ogr++) {
			System.out.println(ogrenciler[ogr]);
		}
		System.out.println("****************");
		for(String ogrenci:ogrenciler) {
			System.out.println(ogrenci);
		}
		
		System.out.println("--------------------");

		// Java Dersi 16: Çok Boyutlu Diziler
		String[][] sehirler = new String[3][3];
		sehirler[0][0] = "İstanbul";
		sehirler[0][1] = "Ankara";
		sehirler[0][2] = "İzmir";
		sehirler[1][0] = "Bursa";
		sehirler[1][1] = "Gaziantep";
		sehirler[1][2] = "Konya";
		sehirler[2][0] = "Tekirdağ";
		sehirler[2][1] = "Diyarbakır";
		sehirler[2][2] = "Antalya";
		
		for(int str=0;str<=2;str++) {
			System.out.println("---------");
			for(int stn=0;stn<=2;stn++) {
				System.out.println(sehirler[str][stn]);
			}
		}
		
		System.out.println("--------------------");

		// Java Dersi 17-18: Stringler
		String metin = "Bugün hava çok güzel.";
		System.out.println(metin);
		System.out.println("Eleman Sayısı : " + metin.length());
		System.out.println("5. Eleman : " + metin.charAt(4));
		System.out.println(metin.concat("Yaşasın!"));
		System.out.println(metin.startsWith("B"));
		System.out.println(metin.endsWith("n"));
		char[] karakterler = new char[12];
		metin.getChars(0, 7, karakterler, 0);
		System.out.println(karakterler);	
		System.out.println(metin.indexOf("av"));
		System.out.println(metin.lastIndexOf("a"));	
		System.out.println("*******");
		System.out.println(metin.replace('ü', 'u'));	
		System.out.println(metin.substring(2));	
		System.out.println(metin.substring(2, 4));
		
		for (String kelime:metin.split(" ")) {	
			System.out.println(kelime);
		}
		
		System.out.println(metin.toLowerCase());
		System.out.println(metin.toUpperCase());
		System.out.println(metin.trim());
	}

}
