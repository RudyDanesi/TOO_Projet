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
    public void displayDocument(JTextArea console) {
        console.append("############  DOCUMENT (MUSIC) ############");
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
        console.append("\n## Music track size (minutes) : ");
        console.append("\n\t"+DureePiste);
    }

    
    
}
