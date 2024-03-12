public class Main {
    public static void main(String[] args) {
        Shop.Product[] products = new Shop.Product[3];
        products[0] = new Shop.Product(1.5, 10);
        products[1] = new Shop.Product(6.0, 15);
        products[2] = new Shop.Product(9.5, 25);

        Shop shop = new Shop(18, products, 7);
        System.out.println(shop.toString());

        Supermarket supermarket = new Supermarket(18, products, 5, 500, new String[]{"Food", "Electronics", "Clothing", "Cosmetics"});
        System.out.println(supermarket.toString());
    }
}
