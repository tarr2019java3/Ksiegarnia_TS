package pl.sda.student;

public class Book {
    private Category category;
    private Author author;
    private String title;

    public Book() {
    }

    public Book(String title, Author author, Category category) {
        this.category = category;
        this.author = author;
        this.title = title;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
