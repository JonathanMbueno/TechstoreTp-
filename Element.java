package techstore;

public class Element {

    private Article article;
    private long quantite;

    public Element(Article article, long quantite) {
        this.article = article;
        this.quantite = quantite;
    }

    public Element(String nom, double prix, long quantite) {
        this.article = new Article(nom, prix, "");
        this.quantite = quantite;
    }

    public Article getArticle() {
        return article;
    }

    public long getQuantite() {
        return quantite;
    }

    public String getReferenceArticle() {
        return article.getReferences();
    }

    public String getNomArticle() {
        return article.getNom();
    }

    public double getPrixArticle() {
        return article.getPrix();
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public void setQuantite(long quantite) {
        if (quantite >= 0) {
            this.quantite = quantite;
        }
    }

    public void incrementerQuantite(long quantite) {
        if (quantite > 0) {
            this.quantite += quantite;
        }
    }

    public void decrementerQuantite(long quantite) {
        if (quantite > 0 && quantite <= this.quantite) {
            this.quantite -= quantite;
        }
    }

    public void modifier(String nom, double prix, long quantite) {
        if (quantite >= 0) {
            this.article = new Article(nom, prix, "");
            this.quantite = quantite;
        }
    }

    public boolean equals(String reference) {
        return article.getReferences().equals(reference);
    }

    public boolean equals(Article article) {
        return this.article.getReferences()
                .equals(article.getReferences());
    }

    @Override
    public String toString() {
        return "Element [article=" + article
                + ", quantite=" + quantite + "]";
    }
}
