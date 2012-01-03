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
public class Film extends Document{

    protected int taille;

    public Film(String auteur, String titre, String edit, int anPub, Categorie cat, int taille) {
        super(auteur, titre, edit, anPub, cat);
        this.taille = taille;
    }

    public Film() {
        this.taille = -1;
    }

    @Override
    public void displayDocument(JTextArea console) {
        console.append("############  DOCUMENT (MOVIE) ############");
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
        console.append("\n## Movie size (minutes) : ");
        console.append("\n\t"+taille);
    }

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

}
