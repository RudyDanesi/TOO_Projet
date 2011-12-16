/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Rudash
 */
public class Mediatheque {

    protected ArrayList<Document> documentList;
    
    protected Categorie chooseCateg()
    {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        do 
        {//on répète cette boucle tant que l'utilisateur n'a pas rentré un entier figurant dans la liste
            i = 0;
            System.out.println("## Quelle est la categorie du document a ajouter ? ");
            System.out.println("\t 1)  RPG");
            System.out.println("\t 2)  FPS");
            System.out.println("\t 3)  Plateforme");
            System.out.println("\t 4)  Action");
            System.out.println("\t 5)  SF");
            System.out.println("\t 6)  BD");
            System.out.println("\t 7)  Manga");
            System.out.println("\t 8)  Roman");
            System.out.println("\t 9)  Drame");
            System.out.println("\t 10) PopRock");
            System.out.println("\t 11) Alternative");
            System.out.println("\t 12) Classique");
            System.out.println("\t 13) Autre");
           
              
            i = sc.nextInt();
            if (( i < 1 )&&( i > 13 ))
                System.out.println("\t !! Veuillez entrer des caracteres valides (1 -> 13)");
            
            switch(i)
            {
                case 1:
                    return(Categorie.RPG);
                case 2:
                    return(Categorie.FPS);
                case 3:
                    return(Categorie.Plateforme);
                case 4:
                    return(Categorie.Action);
                case 5:
                    return(Categorie.SF);
                case 6:
                    return(Categorie.BD);
                case 7:
                    return(Categorie.Manga);
                case 8:
                    return(Categorie.Roman);
                case 9:
                    return(Categorie.Drame);
                case 10:
                    return(Categorie.PopRock);
                case 11:
                    return(Categorie.Alternative);
                case 12:
                    return(Categorie.Classique);
                case 13:
                    return(Categorie.Autre);
                default:
                    System.out.println("\t !! Erreur !!");
                    break;
            }  
        }while (( i < 1 )&&( i > 13 ));
        // Ce return est inutile
        return(Categorie.Autre);
    }
    
    public Mediatheque()
    {
        System.out.println("Creation mediatheque");
        documentList = new ArrayList(4);
        
        // 4 documents are created by default. 1 of each class.
        // Doc 1
        Film f1 = new Film("James Cameron","Avatar","FOX",2010,Categorie.SF,160);
        documentList.add(f1);
        // Doc 2
        JeuxVideo jv1 = new JeuxVideo("Naughty Dog","Uncharted 3","Sony",2011,Categorie.Plateforme,0,"PS3");
        documentList.add(jv1);
        // Doc 3
        Livre l1 = new Livre("Victor Hugo", "Les Miserables", "Hachette", 1991, Categorie.Roman,"Livre de Poche");
        documentList.add(l1);
        // Doc 4
        Musique m1 = new Musique("The All American Rejects","Someday's gone","Universal Music",2011,Categorie.PopRock,3);
        documentList.add(m1);
      
    }
    
    // Display all documents
    public void displayDocument()
    {
        for (int i=0; i < documentList.size(); i++)
        {
            documentList.get(i).displayDocument();
        }
    }
    
    public void addVideoGame()
    {
        Scanner sc2 = new Scanner(System.in);
        String newAuthor;
        String newTitle;
        String newEditor;
        int newRdate;
        Categorie newCateg;
        int newPEGI;
        String newSupport;
        
        System.out.println("############  AJOUT D'UN JEU VIDEO ############");
        System.out.println("## Author : ");
        newAuthor = sc2.nextLine();
        System.out.println("## Title : ");
        newTitle = sc2.nextLine();
        System.out.println("## Editor : ");
        newEditor = sc2.nextLine();
        System.out.println("## Release date : ");
        newRdate = sc2.nextInt();
        System.out.println("## Category : ");
        newCateg = chooseCateg();
        System.out.println("## PEGI Recommandation : ");
        newPEGI = sc2.nextInt();
        System.out.println("## Support : ");
        newSupport = sc2.nextLine();
        
        JeuxVideo jv = new JeuxVideo(newAuthor,newTitle,newEditor,newRdate,newCateg,newPEGI,newSupport);
        documentList.add(jv);
    }
    
    public void addMusic()
    {
        Scanner sc2 = new Scanner(System.in);
        String newAuthor;
        String newTitle;
        String newEditor;
        int newRdate;
        Categorie newCateg;
        int newTsize;
        
        System.out.println("############  AJOUT D'UNE MUSIQUE ############");
        System.out.println("## Author : ");
        newAuthor = sc2.nextLine();
        System.out.println("## Title : ");
        newTitle = sc2.nextLine();
        System.out.println("## Editor : ");
        newEditor = sc2.nextLine();
        System.out.println("## Release date : ");
        newRdate = sc2.nextInt();
        System.out.println("## Category : ");
        newCateg = chooseCateg();
        System.out.println("## Music track size (minutes) : ");
        newTsize = sc2.nextInt();

        
        Musique msq = new Musique(newAuthor,newTitle,newEditor,newRdate,newCateg,newTsize);
        documentList.add(msq);
    }
    
    public void addMovie()
    {
        Scanner sc2 = new Scanner(System.in);
        String newAuthor;
        String newTitle;
        String newEditor;
        int newRdate;
        Categorie newCateg;
        int newMsize;
        
        System.out.println("############  AJOUT D'UN FILM ############");
        System.out.println("## Author : ");
        newAuthor = sc2.nextLine();
        System.out.println("## Title : ");
        newTitle = sc2.nextLine();
        System.out.println("## Editor : ");
        newEditor = sc2.nextLine();
        System.out.println("## Release date : ");
        newRdate = sc2.nextInt();
        System.out.println("## Category : ");
        newCateg = chooseCateg();
        System.out.println("## Movie size (minutes) : ");
        newMsize = sc2.nextInt();

        
        Film mv = new Film(newAuthor,newTitle,newEditor,newRdate,newCateg,newMsize);
        documentList.add(mv);
    }
    
    public void addBook()
    {
        Scanner sc2 = new Scanner(System.in);
        String newAuthor;
        String newTitle;
        String newEditor;
        int newRdate;
        Categorie newCateg;
        String newSupport;
        
        System.out.println("############  AJOUT D'UN LIVRE ############");
        System.out.println("## Author : ");
        newAuthor = sc2.nextLine();
        System.out.println("## Title : ");
        newTitle = sc2.nextLine();
        System.out.println("## Editor : ");
        newEditor = sc2.nextLine();
        System.out.println("## Release date : ");
        newRdate = sc2.nextInt();
        System.out.println("## Category : ");
        newCateg = chooseCateg();
        System.out.println("## Support : ");
        newSupport = sc2.nextLine();

        Livre bk = new Livre(newAuthor,newTitle,newEditor,newRdate,newCateg,newSupport);
        documentList.add(bk);
    }
    
    public void addDocument()
    {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        do 
        {//on répète cette boucle tant que l'utilisateur n'a pas rentré un entier figurant dans la liste
            i = 0;
            System.out.println("############ AJOUT D'UN DOCUMENT ############");
            System.out.println("## Quel type de document voulez vous ajouter ? ");
            System.out.println("\t 1) Un film");
            System.out.println("\t 2) Un jeu video");
            System.out.println("\t 3) Un livre");
            System.out.println("\t 4) Une musique");
            System.out.println("\t 9) Revenir en arriere");
              
            i = sc.nextInt();
            System.out.println(i);
            
            if (( i != 1 )&&( i != 2)&&( i != 3)&&( i != 4)&&( i != 9))
              System.out.println("\t !! Veuillez entrer des caracteres valides (1/2/3/4/9)");
        }while (( i != 1 )&&( i != 2)&&( i != 3)&&( i != 4)&&( i != 9));
            
        switch(i)
        {
            case 1:
                addMovie();
                break;
            case 2:
                addVideoGame();
                break;
            case 3:
                addBook();
                break;
            case 4:
                addMusic();
                break;
            case 9:
                break;
            default:
                System.out.println("\t !! Erreur !!");
        }  
    }
    
    
}
