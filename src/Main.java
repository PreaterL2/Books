import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> lista = new ArrayList<>();
        lista.add(new Book("Descent", "Andrew Robertson", 220, LocalDate.of(2018, 04, 02)));
        lista.add(new Book("The Notebook", "Mathew Jakl", 189, LocalDate.of(2002, 05, 01)));
        lista.add(new Book("Ocean in the dark", "Mephisto Ren", 292, LocalDate.of(2010, 12, 07)));
        lista.add(new Book("Narcos", "Robert Zarabia", 345, LocalDate.of(1999, 12, 17)));
        lista.add(new Book("300", "Denis Neymaro", 299, LocalDate.of(1990, 03, 8)));
        lista.add(new Book("Wresl", "Andrew Kiesa", 111, LocalDate.of(1998, 10, 02)));
        lista.add(new Book("Themeee", "Sakl Emos", 189, LocalDate.of(2012, 02, 01)));
        lista.add(new Book("Dark", "Anrhony Hopkins", 212, LocalDate.of(2000, 12, 07)));
        lista.add(new Book("Paper house", "Serba Calles", 1345, LocalDate.of(1979, 12, 17)));
        lista.add(new Book("Love", "Bill Collins", 289, LocalDate.of(1991, 03, 8)));


        for (Book book : lista) {
            System.out.println("book " + book.getTitle() + " is " + book.getDays() + " days old.");
        }
//        Book maax =  Collections.max(lista, Comparator.comparing(s -> s.getDays()));
//        System.out.println("The oldest book is " + maax.getTitle() + ".")';
        Book oldestBook = lista.get(0);
        for (Book book : lista) {
            if (oldestBook.getDays() < book.getDays()) {
                oldestBook = book;
            }
        }
        System.out.println("\nThe oldest book is " + oldestBook.getTitle() + ".");
            Book newestBook = lista.get(0);
            for (Book book : lista) {
                if (newestBook.getDays() > book.getDays()) {
                    newestBook = book;
                }
            }
            System.out.println("\nThe newest book is " + newestBook.getTitle() + ".");
    }
}


