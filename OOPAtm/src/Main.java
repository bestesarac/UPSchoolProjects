
public class Main {

	public static void main(String[] args) {
		
		Atm atm = new Atm();
		
		Hesap hesap = new Hesap("Beste Saraç", "123456", 1000);
		
		atm.calis(hesap);
		System.out.println("Programdan çıkılıyor.");

	}

}
