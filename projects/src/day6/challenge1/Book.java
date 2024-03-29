package day6.challenge1;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private String language;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Book(String title, String author, String isbn, String language) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.language = language;
    }


}
