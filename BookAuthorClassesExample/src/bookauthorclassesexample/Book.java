
package bookauthorclassesexample;


public class Book {

    public Book(String title, int year, int year1, Author author, String publisher) {
        this.title = title;
        this.year = year;
        this.year1 = year1;
        this.author = author;
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Book{" + "title=" + title + ", year=" + year + ", year1=" + year1 + ", author=" + author + ", publisher=" + publisher + '}';
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public int getYear1() {
        return year1;
    }

    public Author getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    String title;
    int year;
    int year1;
    Author author;
    String publisher;
}
