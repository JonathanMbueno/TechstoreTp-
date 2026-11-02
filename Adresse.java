package techstore;

public class Adresse {
	private String gouvernorat;
	private int codePostale;
	public Adresse(String gouv,int code) {
		this.gouvernorat=gouv;
		this.codePostale=code;
		
	}
	public String getgouvernorat() {
		return gouvernorat;
	
	}
	public int getcodePostal() {
		return codePostale;
	
	}
	public void setgouvernorat(String gouv) {this.gouvernorat=gouv;
	
	}public void setcodePostle(int code) {
		this.codePostale=code;
	}
	public String toString() {
		return "Adresse[gouvernorat:"+this.gouvernorat+", codePostale"+this.codePostale+" ]";
	}

}
