package recapDemo1;

public class Main {

	public static void main(String[] args) {
	
		int sayi1 = 220;
		int sayi2 = 25;
		int sayi3 = 2;
		int enBuyuk = sayi1;
		
		if(sayi1<sayi2) {
			if(sayi2<sayi3) {
				System.out.println("Sayi3 en büyük olandır.");
			}
			else {
				System.out.println("Sayi2 en büyük olandır.");
			}
			
		}
		else if(sayi2<sayi1) {
			if(sayi1<sayi3) {
				System.out.println("Sayi3 en büyük olandır.");
			
			}
			else {
				System.out.println("Sayi1 en büyük olandır.");
			}
		}
		else {
			System.out.println("Hesaplanamıyor!");
		}

		
		////////////////////////////////////
		
		if (enBuyuk<sayi2) {
			enBuyuk = sayi2;
		}
		
		if (enBuyuk<sayi3) {
			enBuyuk = sayi3;
		}
		
		System.out.println("En büyük = " + enBuyuk);

	}
}
