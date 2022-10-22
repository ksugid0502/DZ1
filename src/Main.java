public class Main {
    public static void main(String[] args) {
      int[] sales={500, 100, 300, 400};

        SalesManager SalesManager = new SalesManager(sales);
        System.out.println("max: " + SalesManager.max());
        System.out.println(SalesManager.stat());
    }
}