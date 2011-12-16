/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Rudash
 */
public class Musique extends Document
{
    int DureePiste;

    public Musique(String auteur, String titre, String edit, int anPub, Categorie cat, int DureePiste) 
    {
        super(auteur, titre, edit, anPub, cat);
        this.DureePiste = DureePiste;
    }

    public Musique() 
    {
        this.DureePiste = -1;
    }

    public int getDureePiste() 
    {
        return DureePiste;
    }

    public void setDureePiste(int DureePiste) 
    {
        this.DureePiste = DureePiste;
    }

    @Override
    public void displayDocument() {
        System.out.println("############  DOCUMENT (MUSIC) ############");
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
        System.out.println("## Music track size (minutes) : ");
        System.out.println("\t"+DureePiste);
    }

    
    
}
