
public class EsitAgirlik extends Aday {

	public EsitAgirlik(int turkce, int fizik, int matematik, int edebiyat, String isim) {
		super(turkce, fizik, matematik, edebiyat,isim);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int puanHesapla() {
		return getTurkce() * 5 + getEdebiyat() * 4 + getFizik() * 1 + getMatematik() * 5;

	}

}
