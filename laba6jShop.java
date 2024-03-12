public class Shop {
    private int numOfCashiers; // кол-во касс
    private Product[] products; // массив продуктов
    private int numOfSellers; //кол-во кассиров

    public static class Product {
        private double weight;
        private double price;

        public Product(double weight, double price) {
            this.weight = weight;
            this.price = price;
        }

        public double getWeight() {
            return weight;
       }
    }

    public Shop(int numOfCashiers, Product[] products, int numOfSellers) {
        this.numOfCashiers = numOfCashiers;
        this.products = products;
        this.numOfSellers = numOfSellers;
    }
    public double AverageProductWeight() {
        double sumWeight = 0;
        for (Product product : products) {
            sumWeight += product.getWeight();
        }
        return sumWeight / products.length;
    }

    public double CashEfficiency() {
        return (double) numOfSellers / numOfCashiers;
    }

    public double Efficiency1() {
        return AverageProductWeight() / CashEfficiency();
    }

    public String toString() {
        return "Number of cashiers: " + numOfCashiers + "\n" +
                "Number of sellers: " + numOfSellers + "\n" +
                "Efficiency: " + Efficiency1();
    }
}