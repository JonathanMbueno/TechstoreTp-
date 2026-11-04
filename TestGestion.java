package techstore;
import java.util.ArrayList;
import java.util.Scanner;
public class TestGestion {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        ArrayList<String> noms = new ArrayList<String>();
	        ArrayList<Double> prix = new ArrayList<Double>();
	        ArrayList<Long> quantites = new ArrayList<Long>();

	        noms.add("Micro Casque 588 Filaire");
	        prix.add(80.0);
	        quantites.add(10L);

	        noms.add("Souris sans fil");
	        prix.add(35.0);
	        quantites.add(15L);

	        Stock stock = new Stock(noms, prix, quantites);

	        int choix;

	        do {
	            System.out.println("\n========== GESTION DU STOCK TECHSTORE ==========");
	            System.out.println("0 - Ajouter un article");
	            System.out.println("1 - Augmenter la quantite d'un article");
	            System.out.println("2 - Modifier un article");
	            System.out.println("3 - Supprimer un article");
	            System.out.println("4 - Consulter le stock");
	            System.out.println("5 - Quitter");
	            System.out.print("Votre choix : ");

	            choix = Integer.parseInt(sc.nextLine());

	            switch (choix) {

	            case 0:
	                System.out.print("Nom de l'article : ");
	                String nom = sc.nextLine();

	                System.out.print("Prix : ");
	                double prixArticle = Double.parseDouble(sc.nextLine());

	                System.out.print("Quantite : ");
	                long quantite = Long.parseLong(sc.nextLine());

	                if (prixArticle < 0 || quantite < 0) {
	                    System.out.println("Valeurs invalides !");
	                } else {
	                    stock.ajouterArticle(nom, prixArticle, quantite);
	                    System.out.println("Article ajoute avec succes !");
	                }
	                break;

	            case 1:
	                System.out.print("Reference de l'article : ");
	                String ref1 = sc.nextLine();

	                System.out.print("Quantite a ajouter : ");
	                long q1 = Long.parseLong(sc.nextLine());

	                if (stock.trouverArticle(ref1) == null) {
	                    System.out.println("Article introuvable !");
	                } else if (q1 <= 0) {
	                    System.out.println("Quantite invalide !");
	                } else {
	                    stock.incrementerQuantiteArticle(ref1, q1);
	                    System.out.println("Quantite augmentee avec succes !");
	                }
	                break;

	            case 2:
	                System.out.print("Reference de l'article : ");
	                String ref2 = sc.nextLine();

	                Element e1 = stock.trouverArticle(ref2);

	                if (e1 == null) {
	                    System.out.println("Article introuvable !");
	                } else {
	                    System.out.print("Nouveau nom : ");
	                    String nouveauNom = sc.nextLine();

	                    System.out.print("Nouveau prix : ");
	                    double nouveauPrix = Double.parseDouble(sc.nextLine());

	                    System.out.print("Nouvelle quantite : ");
	                    long nouvelleQuantite = Long.parseLong(sc.nextLine());

	                    if (nouveauPrix < 0 || nouvelleQuantite < 0) {
	                        System.out.println("Valeurs invalides !");
	                    } else {
	                        stock.modifierArticle(ref2, nouveauNom,
	                                nouveauPrix, nouvelleQuantite);
	                        System.out.println("Article modifie avec succes !");
	                    }
	                }
	                break;

	            case 3:
	                System.out.print("Reference de l'article : ");
	                String ref3 = sc.nextLine();

	                if (stock.trouverArticle(ref3) == null) {
	                    System.out.println("Article introuvable !");
	                } else {
	                    stock.supprimerArticle(ref3);
	                    System.out.println("Article supprime avec succes !");
	                }
	                break;

	            case 4:
	                System.out.println("\n========== CONTENU DU STOCK ==========");
	                System.out.println(stock);
	                System.out.println("Nombre d'articles : " + stock.getArticleNb());
	                break;

	            case 5:
	                System.out.println("Fermeture du programme. Au revoir !");
	                break;

	            default:
	                System.out.println("Choix invalide !");
	            }

	        } while (choix != 5);

	        sc.close();
	    }

}
