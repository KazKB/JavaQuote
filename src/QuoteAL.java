import java.util.ArrayList;

public class QuoteAL {
    private ArrayList<String> quote = new ArrayList();
    private int count;

    public QuoteAL() {
         count = 0;
    }

    public void add(String s) {
        quote.add(s);
        count++;
    }

    public void add(int i, String s) {
        quote.add(i, s);
        count++;
    }

    public String get(int i) {
        return String.valueOf(quote.get(i));
    }

    public int count() {
        return count;
    }

    @Override
    public String toString() {
        return "QuoteAL{" +
                "quote=" + quote +
                '}';
    }
}
