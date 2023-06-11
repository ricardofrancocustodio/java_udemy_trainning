package JavaUdemyTrainning.OOP.LibrarySystem;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LibraryRun {

    public static void main(String[] args) {

        Member ana = new Member(1, "Ana");

        //pass book list - use Linked List
        List<Book> bookList = new LinkedList<>(Arrays.asList(
                        new Book("O Senhor dos Aneis","J.R.R. Tolkien"),
                        new Book("Perto do coração selvagem","Clarice Lispector"),
                        new Book("The raven","Edgar Allan Poe")
        ));

        Library library = new Library(bookList);

        System.out.println("Library:");

        //list library
        for (Book book: library.get_bookList()) {
            System.out.println(book.get_title() +" - "+ book.get_author());
        }

        //add book to library
        Book newbook = new Book("Humilhados e ofendidos","Fiódor Dostoiévski");
        library.addBookLibrary(newbook);

        System.out.println("------------------");
        System.out.println("Library (new book added):");

        //list library - new book added to list
        for (Book book: library.get_bookList()) {
            System.out.println(book.get_title() +" - "+ book.get_author());
        }

        //borrow book to member
        for (Book book: library.get_bookList()) {
            if( (book.get_title().equals("The raven")) && (book.get_author().equals("Edgar Allan Poe")) ){
                library.borrowBookMember(ana, book);
            }
        }

        System.out.println("------------------");
        System.out.println("Library (one book borrowed):");

        //list library - one book borrowed
        for (Book book: library.get_bookList()) {
            System.out.println(book.get_title() +" - "+ book.get_author());
        }
        System.out.println("------------------");
        System.out.println("Membro + Livro emprestado: " + library.get_borrowedBookList());
        System.out.println("------------------");
        library.returnBookToLibrary(ana, new Book("The raven","Edgar Allan Poe"));
        System.out.println("Livro devolvido... ");
        System.out.println("---------------");

        //list library - one book borrowed
        for (Book book: library.get_bookList()) {
            System.out.println(book.get_title() +" - "+ book.get_author());
        }
        System.out.println("---------------");
        System.out.println("Livros Emprestados: " + library.get_borrowedBookList());

    }
}

//        pass book list - You can't add to it; you can't remove from it;
//        List<Book> bookList =  Arrays.asList(
//                new Book("O Senhor dos Aneis","J.R.R. Tolkien"),
//                new Book("Perto do coração selvagem","Clarice Lispector"),
//                new Book("The raven","Edgar Allan Poe")
//        );