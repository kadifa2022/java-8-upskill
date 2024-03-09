package JavaQuestions.book;

public class Book {
    private String title;
    private String author;
    private int age;
    private Double price;

    public Book(String title, String author, int age, Double price) {
        this.title = title;
        this.author = author;
        this.age = age;
        this.price = price;
    }

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", age=" + age +
                ", price=" + price +
                '}';
    }
}
