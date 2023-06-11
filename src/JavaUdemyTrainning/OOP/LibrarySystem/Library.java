package JavaUdemyTrainning.OOP.LibrarySystem;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {

    List<Book> _bookList;
    Map<String, String> _borrowedBookList = new HashMap<>();

    public Library(List<Book> bookList){
        this._bookList = bookList;
    }

    //adding books
    public void addBookLibrary(Book book){
        _bookList.add(book);
    }

    //borrowing books
    public void borrowBookMember(Member member, Book book){
        _borrowedBookList.put(member.get_name(),book.get_title());
        _bookList.remove(book);
    }

    //returning books
    public void returnBookToLibrary(Member member, Book book){
        _borrowedBookList.remove(member.get_name(),book.get_title());
        addBookLibrary(book);
    }

    public Map<String, String> get_borrowedBookList() {
        return _borrowedBookList;
    }

    public List<Book> get_bookList() {
        return _bookList;
    }
}
