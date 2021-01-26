package JavaClassesMainTask;


public class BooksArray extends Book {
    public BooksArray(int id, String title, String authors, String publishingHouse, int yearOfPublication, int qauntityOfPages, double price, String coverType) {
        super(id, title, authors, publishingHouse, yearOfPublication, qauntityOfPages, price, coverType);
    }

    @Override
    public String toString() {
        return "BooksArray{" +
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
    public int getId() {
        return super.getId();
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public String getTitle() {
        return super.getTitle();
    }

    @Override
    public void setTitle(String title) {
        super.setTitle(title);
    }

    @Override
    public String getAuthors() {
        return super.getAuthors();
    }

    @Override
    public void setAuthors(String authors) {
        super.setAuthors(authors);
    }

    @Override
    public String getPublishingHouse() {
        return super.getPublishingHouse();
    }

    @Override
    public void setPublishingHouse(String publishingHouse) {
        super.setPublishingHouse(publishingHouse);
    }

    @Override
    public int getYearOfPublication() {
        return super.getYearOfPublication();
    }

    @Override
    public void setYearOfPublication(int yearOfPublication) {
        super.setYearOfPublication(yearOfPublication);
    }

    @Override
    public int getQauntityOfPages() {
        return super.getQauntityOfPages();
    }

    @Override
    public void setQauntityOfPages(int qauntityOfPages) {
        super.setQauntityOfPages(qauntityOfPages);
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public void setPrice(double price) {
        super.setPrice(price);
    }

    @Override
    public String getCoverType() {
        return super.getCoverType();
    }

    @Override
    public void setCoverType(String coverType) {
        super.setCoverType(coverType);
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {

        Book[] book = new Book[5];

        Book zulejha = new Book(1, "'Зулейха открывает глаза'", "Гузель Яхина", "'АСТ'", 2016, 512, 23.13, "твёрдый переплёт");
        Book tsvety = new Book(2, "'Цветы для Элджернона'", "Дэниел Киз", "'Эксмо'", 2017, 320, 10.70, "твёрдый переплёт");
        Book vino = new Book(3, "'Вино из одуванчиков'", "Рэй Брэдбери", "'Эксмо'", 2017, 320, 10.07, "твёрдый переплёт");
        Book chetyresta = new Book(4, "'451 градус по Фаренгейту'", "Рэй Брэдбери", "'Эксмо'", 2016, 320, 10.02, "твёрдый переплёт");
        Book otel = new Book(5, "'Отель'", "Артур Хейли", "'АСТ'", 2019, 608, 13.62, "мягкая обложка");

        book[0] = zulejha;
        book[1] = tsvety;
        book[2] = vino;
        book[3] = chetyresta;
        book[4] = otel;

        int i = 0;
        for (Book temp : book) {
            System.out.println("книга " + temp.getId() + ", " + temp.getTitle() + ", " + temp.getAuthors() + ", " + temp.getPublishingHouse() + ", " + temp.getYearOfPublication() + ", " + temp.getQauntityOfPages() + " с." +", " + temp.getPrice() + " руб." + ", " + temp.getCoverType());
        }
        for (int j = 0; j < book.length; j++) {
            String a = "Рэй Брэдбери";
            if (book[j].getAuthors() == a) {
                System.out.println("Книги автора " + a + " : " + book[j]);
                }
        }
        for (int h = 0; h < book.length; h++) {
            String b = "'АСТ'";
            if (book[h].getPublishingHouse() == b) {
                System.out.println("Издательством " + b + " была выпущена книга : " + book[h]);
            }
        }
        for (int k = 0; k < book.length; k++) {
            int g = 2016;
            if (book[k].getYearOfPublication() > g) {
                System.out.println("После " + g + " года была выпущена книга : " + book[k]);
            }
        }
    }
}
