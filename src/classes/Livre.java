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
public class Livre extends Document {
    
    protected String Support;

    public Livre(String auteur, String titre, String edit, int anPub, Categorie cat, String Support) {
        super(auteur, titre, edit, anPub, cat);
        this.Support = Support;
    }

    public Livre() {
        this.Support = "undefined";
    }

    public String getSupport() {
        return Support;
    }

    public void setSupport(String Support) {
        this.Support = Support;
    }

    @Override
    public void displayDocument(JTextArea console) {
        console.append("############  DOCUMENT (BOOK) ############");
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
        console.append("\n## Support : ");
        console.append("\n\t"+Support);
    }   
}