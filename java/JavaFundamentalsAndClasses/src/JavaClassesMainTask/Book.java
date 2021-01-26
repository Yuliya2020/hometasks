package JavaClassesMainTask;

import java.util.Objects;
import java.lang.Comparable;

public class Book implements Comparable<Book>{
    public int id;
    public String title;
    public String authors;
    public String publishingHouse;
    public int yearOfPublication;
    public int qauntityOfPages;
    public double price;
    public String coverType;

    public Book(int id, String title, String authors, String publishingHouse, int yearOfPublication, int qauntityOfPages, double price, String coverType) {
        super ();
        this.id = id;
        this.title = title;
        this.authors = authors;
        this.publishingHouse = publishingHouse;
        this.yearOfPublication = yearOfPublication;
        this.qauntityOfPages = qauntityOfPages;
        this.price = price;
        this.coverType = coverType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public int getQauntityOfPages() {
        return qauntityOfPages;
    }

    public void setQauntityOfPages(int qauntityOfPages) {
        this.qauntityOfPages = qauntityOfPages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCoverType() {
        return coverType;
    }

    public void setCoverType(String coverType) {
        this.coverType = coverType;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", authors='" + authors + '\'' +
                ", publishingHouse='" + publishingHouse + '\'' +
                ", yearOfPublication=" + yearOfPublication +
                ", qauntityOfPages=" + qauntityOfPages +
                ", price=" + price +
                ", coverType='" + coverType + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return getId() == book.getId() &&
                getYearOfPublication() == book.getYearOfPublication() &&
                getQauntityOfPages() == book.getQauntityOfPages() &&
                Double.compare(book.getPrice(), getPrice()) == 0 &&
                Objects.equals(getTitle(), book.getTitle()) &&
                Objects.equals(getAuthors(), book.getAuthors()) &&
                Objects.equals(getPublishingHouse(), book.getPublishingHouse()) &&
                Objects.equals(getCoverType(), book.getCoverType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getTitle(), getAuthors(), getPublishingHouse(), getYearOfPublication(), getQauntityOfPages(), getPrice(), getCoverType());
    }

    @Override
    public int compareTo(Book book) {
        return 0;
    }
}
