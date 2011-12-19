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
            System.out.println("## Choose the category from the added document ? ");
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
            System.out.println("\t 12) Classic");
            System.out.println("\t 13) Other");
           
              
            i = sc.nextInt();
            if (( i < 1 )&&( i > 13 ))
                System.out.println("\t !! Please type valid characters (1 -> 13)");
            
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
                    System.out.println("\t !! Error !!");
                    break;
            }  
        }while (( i < 1 )&&( i > 13 ));
        // Ce return est inutile
        return(Categorie.Autre);
    }
    
    public Mediatheque()
    {
        System.out.println("Library creation");
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
        
        System.out.println("############  ADDING A VIDEO GAME ############");
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
        
        System.out.println("############  ADDING A MUSIC ############");
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
        
        System.out.println("############  ADDING A MOVIE ############");
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
        
        System.out.println("############  ADDING A BOOK ############");
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
        {
            i = 0;
            System.out.println("############ ADDING A DOCUMENT ############");
            System.out.println("## What sort of document do you want to add ? ");
            System.out.println("\t 1) A movie");
            System.out.println("\t 2) A video game");
            System.out.println("\t 3) A book");
            System.out.println("\t 4) A song");
            System.out.println("\t 9) Go back");
              
            i = sc.nextInt();
            System.out.println(i);
            
            if (( i != 1 )&&( i != 2)&&( i != 3)&&( i != 4)&&( i != 9))
              System.out.println("\t !! Please type valid characters (1/2/3/4/9)");
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
                System.out.println("\t End of the adding ");
                break;
            default:
                System.out.println("\t !! Error !!");
        }  
    }
    
    public void triParAuteur()
    {
        int min;
        Document buffer;
        for(int i = 1; i < documentList.size() - 1; i++)
	{
            min = i;
            for(int j = i+1; j < documentList.size(); j++)
            {
                    if (documentList.get(j).getNomAuteur().compareTo(documentList.get(min).getNomAuteur()) < 0)
                    {
                         min = j;
                    }
            }                  
            if(min != i)
            {
                // Exchange
                buffer = documentList.get(i);
                documentList.set(i, documentList.get(min));
                documentList.set(min, buffer);
            }
        }
        displayDocument();
    }
    
    public void triParTitre()
    {
        int min;
        Document buffer;
        for(int i = 1; i < documentList.size() - 1; i++)
	{
            min = i;
            for(int j = i+1; j < documentList.size(); j++)
            {
                    if (documentList.get(j).getTitreDoc().compareTo(documentList.get(min).getTitreDoc()) < 0)
                    {
                         min = j;
                    }
            }                  
            if(min != i)
            {
                // Exchange
                buffer = documentList.get(i);
                documentList.set(i, documentList.get(min));
                documentList.set(min, buffer);
            }
        }
        displayDocument();
    }
    
    public void searchByAuthor()
    {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int found = -1;
        String author;
        System.out.println("\t Type the author you want to search : ");
        author = sc.nextLine();
        
        while ((i < documentList.size()) && (found==-1))
        {
             if (documentList.get(i).getNomAuteur().compareTo(author) == 0)
             {
                 found = 1;
             }
             i++;
        }
        //  If the author has been founded, his mades are displayed.
        if (found == 1)
        {
            System.out.println("\t Search completed: The author (" 
                            + author
                            + ") has been found in the GDB :"     
                            + "\n \t Here are his mades : ");
            
            for(int j = 0; j < documentList.size(); j++)
            {
                if (documentList.get(j).getNomAuteur().compareTo(author) == 0)
                {
                    System.out.println(documentList.get(j).getTitreDoc() );
                }
            }
        }
        else
        {
            System.out.println("\t The search failed: This author("+ author +") is not registered in the GDB");
        }
    }
    
}
