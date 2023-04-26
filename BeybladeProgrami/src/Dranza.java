
public class Dranza extends Beyblade {
	
	private String kutsalCanavar;
	
	public Dranza(String beybladeci, int donusHizi, int saldiriGucu, String kutsalCanavar) {
		super(beybladeci, donusHizi, saldiriGucu);
		this.kutsalCanavar = kutsalCanavar;
	}

	@Override
	public void kutsalCanavarCikar() {
		
		System.out.println(getBeybladeci() + " " + kutsalCanavar + " ortaya çıkarıyor...");
		System.out.println(getBeybladeci() + " 'nın Saldırısı : Alev Kılıcı");
	}

	@Override
	public void bilgileriGoster() {
		
		super.bilgileriGoster();
		
		System.out.println("Kutsal canavar ismi: "+ kutsalCanavar);
	}
	

}
