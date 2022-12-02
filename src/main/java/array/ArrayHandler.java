package array;

public class ArrayHandler {

    void addIndexToNumber(int[] source)
    {
      for (int i = 0; i< source.length; i++) {
        source[i]=source[i]+i;

        }
    }

    void concatenateIndexTwoWord(String[] source)
    {
        for (int i = 0; i< source.length; i++) {
        source[i]=i + "-" + source[i];
        }
    }
}
