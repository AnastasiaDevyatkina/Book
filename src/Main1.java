public class Main1{
    public static void main(String[] args) {
      Book1 book1 = new Book1("Green Mile", "Stewen King", new String[300], 1967);
      Book1 book2 = new Book1("Tom Soier", "Mark Tven", new String[200], 1985);

        System.out.println(book1.equals(book2));
    }
}
