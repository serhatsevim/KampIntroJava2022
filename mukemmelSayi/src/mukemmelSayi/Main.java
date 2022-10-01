package mukemmelSayi;

public class Main {

	public static void main(String[] args) {
		// 6 -->1,2,3
		// 28-->1,2,4,7,14
		int number = 28;
		int total = 0;

		if(number < 0) {
			System.out.println("Geçersiz sayı");
			return;
		}
		
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				total = total + i;
			}
		}

		if (total == number) {
			System.out.println("Mükemmel sayıdır");
		} else {
			System.out.println("Mükemmel sayı değildir");
		}

	}

}
