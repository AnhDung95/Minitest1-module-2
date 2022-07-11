public class Book {
    int bookCode;
    String name;
    double price;
    String author;

    public Book(int bookCode, String name, String author, double price) {
        this.bookCode = bookCode;
        this.name=name;
        this.price=price;
        this.author=author;
    }
    public int getBookCode() {
        return bookCode;
    }

    public void setBookCode(int bookCode) {
        this.bookCode = bookCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

