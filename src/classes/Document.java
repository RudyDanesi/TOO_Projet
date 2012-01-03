/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;
import javax.swing.JTextArea; 
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
        nomAuteur = "indefini";
        titreDoc = "indefini";
        editeur = "indefini";
        anneePublication = 0;
    }
    
    public Document(String auteur, String titre, String edit, int anPub, Categorie cat)
    {
       nomAuteur = auteur;
       titreDoc = titre;
       anneePublication = anPub;
       editeur = edit;
       Categ = cat;
    }

    public void displayDocument(JTextArea console)
    {
        console.append("############  DOCUMENT ############");
        console.append("\n## Author : ");
        console.append("\n\t"+nomAuteur);
        console.append("\n## Title : ");
        console.append("\n\t"+titreDoc);
        console.append("\n## Editor : ");
        console.append("\n\t"+editeur);
        console.append("\n## Release date : ");
        console.append("\n\t"+anneePublication);
        console.append("\n## Category : ");
        console.append("\n\t"+Categ);
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
