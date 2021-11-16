package model;

public class Article {
	
	private String articleUID;
	private String titre;
	private String contenu;
	private User utilisateur;
	
	public Article(){}

	public Article(String articleUID, String titre, String contenu, User utilisateur) {
		super();
		this.articleUID=articleUID;
		this.titre = titre;
		this.contenu = contenu;
		this.utilisateur = utilisateur;
	}

	
	public String getArticleUID() {
		return articleUID;
	}

	public void setArticleUID(String articleUID) {
		this.articleUID = articleUID;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getContenu() {
		return contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

	public User getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(User utilisateur) {
		this.utilisateur = utilisateur;
	}
	
	
}
