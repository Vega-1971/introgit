package compositionlist;

import java.util.ArrayList;
import java.util.List;

public class Books {

    private List<String> titles = new ArrayList<>();

    public void addList(String title) {
        titles.add(title);
    }

    public List<String> getTitles() {
        return titles;
    }

    public void findBookAndSetAuthor(String title, String author) {
        boolean isBookInList=titles.contains(title);
        if (isBookInList==true) {
           int tempIndex = titles.indexOf(title);
           String tempTitle = titles.get(tempIndex);
           titles.set(tempIndex, author + ": " + tempTitle);
        }
        else {
            String message = "Nincs ilyen című könyv!";
        }
    }
}
