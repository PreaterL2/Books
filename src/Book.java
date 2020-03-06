import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Book {
    private String title;
    private String author;
    private int pages;
    private LocalDate printDate;


    public Book(String title, String author, int pages, LocalDate printDate) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.printDate = printDate;
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

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public LocalDate getPrintDate() {
        return printDate;
    }

    public void setPrintDate(LocalDate printDate) {
        this.printDate = printDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", pages=" + pages +
                ", printDate=" + printDate +
                '}';
    }

    public long getDays() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyyy");
        LocalDate input1 = printDate;
        LocalDate input2 = LocalDate.now();
        long diffDays = ChronoUnit.DAYS.between(input1, input2);
        return diffDays;
    }
}


