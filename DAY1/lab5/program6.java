package lab5;
import java.util.Scanner;
import java.util.LinkedList;
import java.io.*;

/**
 *
 * @author Sanat 190953222
 *Program to define a class called book, add details to a file and list books with author "harry"
 */

//book must implement Serializable inorder to be written to a file
class book implements Serializable{
    String title,author;
    int edition;
    //Constructor to initialize book details
    book(String title,String author,int edition){
        this.title=title;
        this.author=author;
        this.edition=edition;
    }
}


public class program6 {
    public static void main(String[] args){
        Scanner scan1=new Scanner(System.in);
        String tempTitle,tempAuthor;
        int tempEdition;
	//Use a LinkedList to store book objects
        LinkedList<book> l1=new LinkedList<book>(),tempList;
        for(int i=0;i<6;i++){
	    System.out.println("Enter Title, Author and Edition for book "+(i+1));
            tempTitle=scan1.next();
            tempAuthor=scan1.next();
            tempEdition=scan1.nextInt();
            l1.add(new book(tempTitle,tempAuthor,tempEdition));
        }
        
        try{
	    //Write the l1 LinkedList<book> object to demo.txt 
            FileOutputStream fOS=new FileOutputStream("demo.txt");
            ObjectOutputStream oOS=new ObjectOutputStream(fOS);
            oOS.writeObject(l1);
	    //push all the data in the stream to the destination 
            oOS.flush();
            oOS.close();
            fOS.close();
	    //Read the object from demo.txt file            
            FileInputStream fIS=new FileInputStream("demo.txt");
            ObjectInputStream iIS=new ObjectInputStream(fIS);
            tempList=(LinkedList<book>)iIS.readObject();
	    //Iterate through the LinkedList, if any book with author "harry" found then print details
	    System.out.println("The books written by harry are: ");
            for(book ivar:tempList){
                if((ivar.author).equals("harry"))
                {
                    System.out.println(ivar.author+" "+ivar.title+" "+ivar.edition);
                }
            }
	    iIS.close();
            fIS.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }   
    }
}

