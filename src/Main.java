import com.workintech.library.Enums.NovelCategory;
import com.workintech.library.authors.Author;
import com.workintech.library.books.Book;
import com.workintech.library.books.NovelBook;
import com.workintech.library.library.Librarian;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {



        List<Book> book =new LinkedList<>();
        Book deneme =new NovelBook(1,"enver",new Author(1,"Mehmet",book), NovelCategory.Biography,245,false);

        Book deneme3 =new NovelBook(3,"ecinniler",new Author(1,"Mehmet",book), NovelCategory.Biography,545,false);
        Book deneme4 =new NovelBook(4,"çocukluğum",new Author(1,"Mehmet",book), NovelCategory.Biography,238,false);
        Book deneme2 =new NovelBook(2,"çalıkuşu",new Author(1,"Mehmet",book), NovelCategory.Fantasy,124,false);







        List<String> book2=new LinkedList<>();
        book.add(deneme);
        book.add(deneme4);
        book.add(deneme2);
        book.add(deneme3);
        deneme2.setName("Ahmet");





        Author author =new Author(1,"Mehmet",book);


        System.out.println(author.toString());

        author.addBook(deneme3);
        System.out.println(author.toString());
        Librarian librarian=new Librarian("mehmet",book);
        System.out.println(librarian.searchBook("enver"));
        librarian.removeBook(1);
        System.out.println(librarian.searchBook("enver"));
        System.out.println(deneme3.getName());
        System.out.println(book);
        librarian.addBook(deneme3);
    }


}