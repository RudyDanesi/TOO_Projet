/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

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
    public void displayDocument() {
        System.out.println("############  DOCUMENT (BOOK) ############");
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
        System.out.println("## Support : ");
        System.out.println("\t"+Support);
    }

    
    
    
}
