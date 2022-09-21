package javaHafta1;

public class sesliHarfler {

	public static void main(String[] args) {
		char harf = 'E';
		
		switch (harf) {
			case 'A', 'I', 'O', 'U':
				System.out.println("Kalın Sesli Harf");
				break;
			default:
				System.out.println("İnce Sesli Harf");
		}
	}

}
