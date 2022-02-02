public class QuoteDriver {

    public static void main(String[] args) {
        QuoteAL quote = new QuoteAL();

        quote.add("A");
        quote.add("rose");
        quote.add("is");
        quote.add("a");
        quote.add("rose");

        System.out.println(quote);
        System.out.println(quote.count());
        System.out.println(quote.get(2));

        quote.add(3, "just");

        System.out.println(quote);
        System.out.println(quote.count());
    }
}
