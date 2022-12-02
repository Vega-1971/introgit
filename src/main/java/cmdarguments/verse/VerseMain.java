package cmdarguments.verse;

public class VerseMain {

    public static void main(String[] args) {
        for (String verseWord : args) {
            System.out.print(verseWord + " ");
        }
        System.out.println();
        for (int i = args.length-1; i >= 0; i=i-1) {
            System.out.print(args[i] + " ");
        }
    }
}
