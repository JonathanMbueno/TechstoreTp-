package techstore;

import java.util.ArrayList;

public class Stock {

    private ArrayList<Element> articleList;

    public Stock() {
        this.articleList = new ArrayList<Element>();
    }

    public Stock(ArrayList<Element> articleList) {
        this.articleList = new ArrayList<Element>(articleList);
    }

    public Stock(ArrayList<String> noms, ArrayList<Double> prix,
                 ArrayList<Long> quantites) {

        this.articleList = new ArrayList<Element>();

        for (int i = 0; i < noms.size(); i++) {
            Element e1 = new Element(
                noms.get(i),
                prix.get(i),
                quantites.get(i)
            );

            articleList.add(e1);
        }
    }

    public ArrayList<Element> getArticleList() {
        return articleList;
    }

    public int getArticleNb() {
        return articleList.size();
    }

    public void setArticleList(ArrayList<Element> articleList) {
        this.articleList = articleList;
    }

    public void ajouterArticle(Article article, long quantite) {
        Element e1 = new Element(article, quantite);
        articleList.add(e1);
    }

    public void ajouterArticle(String nom, double prix, long quantite) {
        Element e1 = new Element(nom, prix, quantite);
        articleList.add(e1);
    }

    public Element trouverArticle(String reference) {
        for (Element e1 : articleList) {
            if (e1.equals(reference)) {
                return e1;
            }
        }
        return null;
    }

    public void modifierArticle(String reference, String nom,
                                double prix, long quantite) {

        Element e1 = trouverArticle(reference);

        if (e1 != null) {
            e1.modifier(nom, prix, quantite);
        }
    }

    public void supprimerArticle(String reference) {
        Element e1 = trouverArticle(reference);

        if (e1 != null) {
            articleList.remove(e1);
        }
    }

    public void incrementerQuantiteArticle(String reference, long quantite) {
        Element e1 = trouverArticle(reference);

        if (e1 != null) {
            e1.incrementerQuantite(quantite);
        }
    }

    public void decrementerQuantiteArticle(String reference, long quantite) {
        Element e1 = trouverArticle(reference);

        if (e1 != null) {
            e1.decrementerQuantite(quantite);
        }
    }

    @Override
    public String toString() {
        String resultat = "";

        for (Element e1 : articleList) {
            resultat += e1.toString() + "\n";
        }

        return resultat;
    }
}


