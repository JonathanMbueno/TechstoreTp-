package techstore;

public class Test {
	public static void main(String[]args) {
	Adresse A1=new Adresse("Monastir",5000);
	Adresse A2=new Adresse("Sousse",4000);
	Adresse A3=new Adresse("Tunis",1000);
	Adresse A4=new Adresse("Sfax",5000);
	
	
	Personne P1=new Personne("0111111","kbayer","Ghayth",A1);

	Personne P2= new Personne("0222222","Mbueno","Jonathan","Sousse",4000);
    System.out.println(A1+"\n"+A2+"\n"+A3);
    System.out.println(P1);
    System.out.println(P2);
    P1.setNom("Mohamed");
    P1.setPrenom("yousouf");
    A1.setgouvernorat("Madhia");
    A1.setcodePostle(2000);
    System.out.println("\n after update \n");
    System.out.println(A1);
    System.out.println(P1);
    System.out.println(P2);
    
    
  
}}

	
