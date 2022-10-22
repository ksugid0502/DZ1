public class SalesManager {
    protected long[] sales;
    public SalesManager(long[] sales) {
        this.sales = sales;
    }
    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int min() {
        int min = Integer.MAX_VALUE;
        for (int sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

    public int stat(){
        int stat = 0;
        for (int sale : sales){
            stat += sale;
            }
        return (stat - min()-max())/(sales.length - 2);
    }
}
