package techstore;

public class Article {
	
	private int Id;
	private String nom;
	private String Reference;
	private double Prix; 
	private static int cmp=0;
	public Article(String nom, double prix) {

		cmp++;
		this.nom = nom;
		this.Reference = genererReference(nom, Id);
		this.Prix = prix;
		this.Id = cmp;
		this.Reference=genererReference(nom, Id);
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
		this.Reference=genererReference(nom, Id);

	}
	public String getReferences() {
		return Reference;
	}
	public void setReferences(String references) {
		Reference = Reference;
	}
	public double getPrix() {
		return Prix;
	}
	public void setPrix(double prix) {
		Prix = prix;
	}
	public String genererReference(String nom, int id) {
	    String reference = "";
	    int indice = 0;

	    for (int i = 0; i < nom.length(); i++) {
	        if (nom.charAt(i) != ' ') {
	            if (indice % 5 == 0) {
	                reference += nom.charAt(i);
	            }
	            indice++;
	        }
	    }

	    return reference + id;
	}
	public void Modifier(String nom) {
		this.nom=nom;
		this.Reference=genererReference(nom, Id);
		}
	public void Modifier(String nom,double Prix) {
		this.nom=nom;
		this.Prix=Prix;
		this.Reference=genererReference(nom, Id);
	}
	@Override
	public String toString() {
		return "Article [Id=" + Id + ", nom=" + nom + ", References=" + Reference + ", Prix=" + Prix + "]";
	}
	}
