package compositionlist;

import java.util.Scanner;

public class BookMain {

    public static void main(String[] args) {

        Books bookList = new Books();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hány könyvet akarsz rögzíteni?");
        int numberOfBooks = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numberOfBooks; i++) {
            System.out.print((i+1) + ". könyv címe: ");
            String titleOfBook = scanner.nextLine();
            bookList.addList(titleOfBook);
            System.out.println();
        }
        System.out.println(bookList.getTitles());

        bookList.findBookAndSetAuthor("A 22-es csapdája", "Joseph Heller");

        System.out.println(bookList.getTitles());

    }
}
