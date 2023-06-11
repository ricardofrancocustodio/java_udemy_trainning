package JavaUdemyTrainning.OOP.LibrarySystem;

public class Book {
    private String _title;
    private String _author;

    public Book(){}

    public Book(String title, String author){
        this._title = title;
        this._author = author;
    }

    public String get_title() {
        return _title;
    }

    public void set_title(String _title) {
        this._title = _title;
    }

    public String get_author() {
        return _author;
    }

    public void set_author(String _author) {
        this._author = _author;
    }






}
