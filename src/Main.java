import com.workintech.library.Enums.NovelCategory;
import com.workintech.library.authors.Author;
import com.workintech.library.books.Book;
import com.workintech.library.books.EncyclopediaBook;
import com.workintech.library.books.MagazinesBook;
import com.workintech.library.books.NovelBook;
import com.workintech.library.library.Librarian;
import com.workintech.library.library.Library;
import com.workintech.library.library.Users;


import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {








       /* Author author =new Author(1,"Mehmet",book);

        System.out.println("***************************");
        System.out.println(author.toString());
        System.out.println("***************************");
        author.addBook(deneme3);
        System.out.println(author.toString());
       // Librarian librarian=new Librarian("mehmet",book);
        //System.out.println(librarian.searchBook("enver"));
        //librarian.removeBook(1);
        //System.out.println(librarian.searchBook("enver"));
        System.out.println(deneme3.getName());
        System.out.println(book);
       // librarian.addBook(deneme3);
       // librarian.listBooksByCategory(NovelCategory.Fantasy);
        Users users =new Users(1,"kitaplcam");
        Users users2 =new Users(2,"kitaplcam2");
        //users.borrowBook(deneme2);
        users.returnBook(deneme2);
        users2.borrowBook(deneme2);*/



        Author mehmet =new Author(1,"Mehmet");

        List<Book> book =new LinkedList<>();
        Book book1 =new NovelBook(1,"enver",mehmet, NovelCategory.Biography,245,false);
        Book book2 =new NovelBook(2,"ecinniler",mehmet, NovelCategory.History,545,false);
        Book book3 =new NovelBook(3,"çocukluğum",mehmet, NovelCategory.History,238,false);
        Book book4 =new NovelBook(4,"Iron Man",new Author(2,"Ahmet"), NovelCategory.Fantasy,124,false);
        Book book5 =new NovelBook(5,"çalıkuşu",new Author(3,"Veli"), NovelCategory.History,124,false);
        Book book6 =new NovelBook(6,"ecinniler",new Author(4,"Samet"), NovelCategory.History,545,false);


        book.add(book1);
        book.add(book2);
        book.add(book3);
        book.add(book4);
        book.add(book5);
        book.add(book6);



        //add book to lib
        Library library =new Library();
       library.addBook(book1);
       library.addBook(book2);
       library.addBook(book3);
       library.addBook(book4);
       library.addBook(book5);
       library.addBook(book6);


       //add librarian
        Librarian newLibrarian=new Librarian("mehmet",book,library);
        System.out.println("**********Update************");

        //new book
        Book book7 =new EncyclopediaBook(8,"Türk Tarihi",new Author(6,"Halil İnalcık"),574,false);
        //add book
        newLibrarian.addBook(book7);
        //update
        book4.setName("Spider Man");
        System.out.println(book4.getName());
        book4.setPage(279);
        System.out.println(book4.getPage());
        System.out.println("**********Remove***********");
        //silme işlemleri
        System.out.println(library.getBooks());
        newLibrarian.removeBook(3);
        newLibrarian.removeBook(12);//id check
        System.out.println(library.getBooks());
        System.out.println("**********Category'e göre listleme************");
        //category'e göre listleme
        newLibrarian.listBooksByCategory(NovelCategory.History);
        System.out.println("************Author***********");
        System.out.println(mehmet.getBooks());
        System.out.println("***********Borrow and return**********");
        //borrow ve return işlemleri
        Users users1 =new Users(1,"mehmet");
        Users users2 =new Users(2,"ahmet");
        users1.borrowBook(book1);
        users1.borrowBook(book2);
        users1.borrowBook(book3);
        users2.borrowBook(book3);//
        users1.borrowBook(book4);
        users1.borrowBook(book5);
        users1.borrowBook(book6);
        users1.returnBook(book5);
        users1.borrowBook(book6);
        System.out.println("***************************");




        System.out.println("***************************");





        System.out.println("***************************");
    }


}