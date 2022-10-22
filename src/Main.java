public class Main {
    public static void main(String[] args) {
      long[] sales={500, 100, 300, 400};

        SalesManager p1 = new SalesManager(sales);
        System.out.println("max: " + p1.max());
    }
}