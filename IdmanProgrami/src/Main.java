import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("İdman Programına Hoşgeldiniz.");
		String hareketler = "Geçerli hareketler\n"
						+"Burpee\n"
						+"Pushup\n"
						+"Situp\n"
						+"Squat";
		System.out.println(hareketler);
		
		System.out.println("Bir idman oluşturun");
		
		System.out.println("Burpee sayısı: ");
		int burpee=scanner.nextInt();
		
		System.out.println("Pushup sayısı: ");
		int pushup=scanner.nextInt();
		
		System.out.println("Situp sayısı: ");
		int situp= scanner.nextInt();
		
		System.out.println("Squat sayısı: ");
		int squat= scanner.nextInt();
		
		scanner.nextLine();
		
		Idman idman = new Idman(burpee, pushup, situp, squat);
		
		System.out.println("İdmanınız başlıyor.");
		
		while (idman.idmanBittiMi()==false) {
			
			System.out.println("Hareket türü giriniz:");
			
			String tur = scanner.nextLine();
			
			System.out.println("Bu hareketten kaç tane yapacaksınız?");
			
			int sayi= scanner.nextInt();
			
			scanner.nextLine();
			
			idman.hareketYap(tur, sayi);
		}
		
		System.out.println("İdman tamamlandı.");

	}

}
