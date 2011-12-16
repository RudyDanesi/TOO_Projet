/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Rudash
 */
public class JeuxVideo extends Document {
    
    protected int PEGI;
    protected String Support;

    public JeuxVideo(String auteur, String titre, String edit, int anPub, Categorie cat, int PEGI, String Support) {
        super(auteur, titre, edit, anPub, cat);
        this.PEGI = PEGI;
        this.Support = Support;
    }

    public JeuxVideo() {
        this.PEGI = 0;
        this.Support = "undefined";
    }

    public int getPEGI() {
        return PEGI;
    }

    public void setPEGI(int PEGI) {
        this.PEGI = PEGI;
    }

    public String getSupport() {
        return Support;
    }

    public void setSupport(String Support) {
        this.Support = Support;
    }

    @Override
    public void displayDocument() {
        System.out.println("############  DOCUMENT (VIDEO GAME) ############");
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
        System.out.println("## PEGI Recommandation : ");
        if (PEGI == 0)
            System.out.println("\t"+"Tout Public");
        else
            System.out.println("\t"+" -" + PEGI);
        System.out.println("## Support : ");
        System.out.println("\t"+Support);
    }
    
    
}
