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
    public void displayDocument(JTextArea console) {
        console.append("############  DOCUMENT (VIDEO GAME) ############");
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
        console.append("\n## PEGI Recommandation : ");
        if (PEGI == 0)
            console.append("\n\t"+"Tout Public");
        else
            console.append("\n\t"+" -" + PEGI);
        console.append("\n## Support : ");
        console.append("\n\t"+Support);
    }
    
    
}
