/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Rudash
 */
public class Document {
    protected String nomAuteur;
    protected String titreDoc;
    protected String editeur;
    protected int anneePublication;
    protected Categorie Categ;

    public Document()
    {
        System.out.println("Document created (Wo parameters)");
        nomAuteur = "indefini";
        titreDoc = "indefini";
        editeur = "indefini";
        anneePublication = 0;
    }
    
    public Document(String auteur, String titre, String edit, int anPub, Categorie cat)
    {
       System.out.println("Document created (W parameters)");
       nomAuteur = auteur;
       titreDoc = titre;
       anneePublication = anPub;
       editeur = edit;
       Categ = cat;
    }

    public void displayDocument()
    {
        System.out.println("############  DOCUMENT ############");
        System.out.println("## Author : ");
        System.out.println("\t"+nomAuteur);
        System.out.println("## Title : ");
        System.out.println("\t"+titreDoc);
        System.out.println("## Editor : ");
        System.out.println("\t"+editeur);
        System.out.println("## Release date : ");
        System.out.println("\t"+anneePublication);
        System.out.println("## Category : ");
        System.out.println("\t"+Categ);
    }

    public Categorie getCateg() {
        return Categ;
    }

    public void setCateg(Categorie Categ) {
        this.Categ = Categ;
    }

    public int getAnneePublication() {
        return anneePublication;
    }

    public void setAnneePublication(int anneePublication) {
        this.anneePublication = anneePublication;
    }

    public String getEditeur() {
        return editeur;
    }

    public void setEditeur(String editeur) {
        this.editeur = editeur;
    }

    public String getNomAuteur() {
        return nomAuteur;
    }

    public void setNomAuteur(String nomAuteur) {
        this.nomAuteur = nomAuteur;
    }

    public String getTitreDoc() {
        return titreDoc;
    }

    public void setTitreDoc(String titreDoc) {
        this.titreDoc = titreDoc;
    }
    
    
}
