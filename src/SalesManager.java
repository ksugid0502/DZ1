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

    public long min() {
        long min = Integer.MAX_VALUE;
        for (long sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

    public long stat(){
        long stat = 0;
        for (long sale : sales){
            stat += sale;
            }
        return (stat - min()-max())/(sales.length - 2);
    }
}
