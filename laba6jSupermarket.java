import java.util.Arrays;
public class Supermarket extends Shop {
    private double area;
    private String[] categories;

    public Supermarket(int numOfCashiers, Product[] products, int numOfSellers, double area, String[] categories) {
        super(numOfCashiers, products, numOfSellers);
        this.area = area;
        this.categories = categories;
    }

    public double Efficiency1() {
        return (area / categories.length) * super.CashEfficiency();
    }

    public String toString() {
        return super.toString() + "\n" +
                "Area: " + area + "\n" +
                "Categories: " +
                Arrays.toString(categories);
    }
}
