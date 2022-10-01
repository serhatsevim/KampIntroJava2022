package methods;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca();
	}
	
	//camel casing
	public static void sayiBulmaca() {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 5;
		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;
			}
		}

		if (varMi) {
			mesajVer("Sayı mevcuttur : " + aranacak);
		} else {
			mesajVer("Sayı bulunamadı : " + aranacak);	
		}		
	}
	
	//parametreli method
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}

}
