package javaHafta1;

public class sayiBulma {

	public static void main(String[] args) {
		int[] numbers = new int[] {1,2,5,7,9,0};
		int find = 5;
		boolean isFind = false;
		
		for(int number: numbers) {
			if(number == find) {
				isFind = true;
				break;
			} 
		}
		
		if(isFind) {
			System.out.println("Sayı mevcuttur!");
		} else
			System.out.println("Sayı mevcut değildir!");
	}

}
