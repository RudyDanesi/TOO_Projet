/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

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
    public void displayDocument() {
        System.out.println("############  DOCUMENT (MOVIE) ############");
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
        System.out.println("## Movie size (minutes) : ");
        System.out.println("\t"+taille);
    }

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

}
