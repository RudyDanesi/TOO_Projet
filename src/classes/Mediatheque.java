/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JFrame;

/**
 *
 * @author Rudash
 */
public class Mediatheque {

    protected ArrayList<Document> documentList;
    protected ArrayList<Document> searchList;
    protected JTextArea mConsole;
    protected JFrame frame;
    
    protected DocumentType inputDocumentType()
    {
        String messagetitle = "Adding a Document";
        Object[] possibilities = {  
                                    DocumentType.Movie, 
                                    DocumentType.VideoGame, 
                                    DocumentType.Book, 
                                    DocumentType.Music
                                 };
        DocumentType s = (DocumentType)JOptionPane.showInputDialog
                (
                    frame,
                    "What sort of document do you want to add ?",
                    messagetitle,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    possibilities,
                    possibilities[0]
                );
        return (s);
        
    }
    
    protected Categorie inputCateg()
    {
        String messagetitle = "Choosing a Categorie";
        Object[] possibilities = {  Categorie.Action,
                                    Categorie.SF,
                                    Categorie.Drame,
                                    Categorie.Alternative,
                                    Categorie.PopRock,
                                    Categorie.Classique,
                                    Categorie.Roman,
                                    Categorie.BD,
                                    Categorie.Manga,
                                    Categorie.Plateforme,
                                    Categorie.FPS,
                                    Categorie.RPG,
                                    Categorie.Autre
                                 };
        Categorie s = (Categorie)JOptionPane.showInputDialog
                (
                    frame,
                    "Choose the document's category :",
                    messagetitle,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    possibilities,
                    possibilities[0]
                );
        return (s);  
    }
        
    protected String inputString(String label, String message)
    {
        String s = (String)JOptionPane.showInputDialog
                (
                    frame,
                    message,
                    label,
                    JOptionPane.PLAIN_MESSAGE
                );
        return s;
    }
    
    
    protected int inputInt(String label, String message)
    {
        String s = (String)JOptionPane.showInputDialog
                (
                    frame,
//                    "\t Release date (YYYY) :",
//                    "Choosing a Date",
                    message,
                    label,
                    JOptionPane.PLAIN_MESSAGE
                );
        return Integer.parseInt(s);
    }
    
    public Mediatheque(JFrame jframe,JTextArea console)
    {
        documentList = new ArrayList(4);
        mConsole = console;
        frame = jframe;
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
            documentList.get(i).displayDocument(mConsole);
        }
    }
    
    public void addDocument()
    {
        DocumentType newType = inputDocumentType();
        Categorie newCateg = inputCateg();
        String newTitle = inputString("Choosing Title","\t Document's title :");
        String newAuthor = inputString("Choosing Author","\t Document's author :");
        String newEditor = inputString("Choosing Editor","\t Document's editor :");
        int newRdate = inputInt("Choosing Date","\t Document's release date :");
        
        switch (newType)
        {
            case Movie:
                int newMsize = inputInt("Choosing Movie Size","\t Movie's size (min [integer])");
                Film mv = new Film(newAuthor,newTitle,newEditor,newRdate,newCateg,newMsize);
                documentList.add(mv);
                break;
            case VideoGame:
                int newPEGI = inputInt("Choosing PEGI","\t Video Game's Pegi recommandation");
                String newSupport = inputString("Choosing Support","\t Video Game's support");       
                JeuxVideo jv = new JeuxVideo(newAuthor,newTitle,newEditor,newRdate,newCateg,newPEGI,newSupport);
                documentList.add(jv);
                break;
            case Book:
                newSupport = inputString("Choosing Support","\t Book's support");
                Livre bk = new Livre(newAuthor,newTitle,newEditor,newRdate,newCateg,newSupport);
                documentList.add(bk);
                break;
            case Music:
                int newTsize = inputInt("Choosing Track Size","\t Music track size (min [integer]) : ");    
                Musique mc = new Musique(newAuthor,newTitle,newEditor,newRdate,newCateg,newTsize);
                documentList.add(mc);
                break;
        }
        return;
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
    }
    
    public ArrayList<Document> getDocumentList()
    {
        return (documentList);
    }
    
    public ArrayList<Document> getSearchList()
    {
        return (searchList);
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
        //displayDocument();
    }
    
    public boolean searchByAuthor(String author)
    {
        int i = 0;
        int found = -1;
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
            //Copy of the document list
            ArrayList<Document> myDocumentList = new ArrayList();
            
            for(int j = 0; j < documentList.size(); j++)
            {
                if (documentList.get(j).getNomAuteur().compareTo(author) == 0)
                {
                    myDocumentList.add(documentList.get(j));
                }
            }
            // Modification of the search list :
            searchList = myDocumentList;
            JOptionPane.showMessageDialog(frame,
                            "\n\t Search completed: \nThe author ( " 
                            + author
                            + " ) has been found in the GDB :");
            return (true);
        }
        else
        {
            JOptionPane.showMessageDialog(frame,
                    "\n\t The search failed: \nThis author( "+ author +" ) is not registered in the GDB");
            return (false);
        }
    } 
    
    
}
