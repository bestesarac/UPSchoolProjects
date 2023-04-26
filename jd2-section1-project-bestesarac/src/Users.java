
public class Users {

	
	private final Long id;
	
	private final String kullaniciAdi;
	
	private final String parola;
	
	private final String eMail;

	public Users(Long id, String kullaniciAdi, String parola, String eMail) {
		this.id = id;
		this.kullaniciAdi = kullaniciAdi;
		this.parola = parola;
		this.eMail = eMail;
	}

	public Long getId() {
		return id;
	}

	public String getKullaniciAdi() {
		return kullaniciAdi;
	}

	public String getParola() {
		return parola;
	}

	public String geteMail() {
		return eMail;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", kullaniciAdi=" + kullaniciAdi + ", eMail=" + eMail + "]";
	}
	
	
}
