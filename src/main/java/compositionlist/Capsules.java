package compositionlist;

import java.util.ArrayList;
import java.util.List;

public class Capsules {

    private List<String> colourCapsules = new ArrayList<>();

    public void addLast(String colour) {
        colourCapsules.add(colour);
    }
    public void removeLast() {
       int lastIndex = colourCapsules.size();
        colourCapsules.remove(lastIndex-1);
    }

    public void removeFirst() {
        colourCapsules.remove(0);
    }

    public void addFirst(String colour) {
        //String temporaryColour;
        colourCapsules.add(0, colour);
         }
    public List<String> getColors() {
        return colourCapsules;
    }
}
