//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Basket {
    private static int count = 0;
    private static double weight = 0.0;
    private String items;
    private static int totalPrice = 0;
    private double totalWeight;
    private int limit;
    private static int totalQuanBasket = 0;
    private static int averagePrice = 0;

    public Basket() {
        this.items = "";
        this.totalWeight = 0.0;
        increaseCount(1);
        this.items = "Список товаров:";
        this.limit = 1000000;
    }

    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public Basket(String items, int totalPrice, int totalWeight) {
        this();
        this.items = this.items + items;
        this.totalWeight = (double)totalWeight;
    }

    public static int getCount() {
        return count;
    }

    public static void increaseCount(int count) {
        Basket.count += count;
    }

    public void add(String name, int price) {
        this.add(name, price, 1, 1.0);
    }

    public static int midPrice() {
        return totalPrice / totalQuanBasket;
    }

    public static int midAverPrice() {
        return totalPrice / count;
    }

    public void add(String name, int price, int count, double weight) {
        boolean error = false;
        if (this.contains(name)) {
            error = true;
        }

        if (totalPrice + count * price >= this.limit) {
            error = true;
        }

        if (error) {
            System.out.println("Error occured :(");
        } else {
            this.items = this.items + "\n" + name + " - " + count + " шт. - " + price + " Вес: " + weight;
            this.totalWeight += (double)count * weight;
            totalPrice += count * price;
            totalQuanBasket += count;
        }
    }

    public int getTotalQuanBasket() {
        return totalQuanBasket;
    }

    public void clear() {
        this.items = "";
        totalPrice = 0;
    }

    public static int getTotalPrice() {
        return totalPrice;
    }

    public double getTotalWeight() {
        return this.totalWeight;
    }

    public boolean contains(String name) {
        return this.items.contains(name);
    }

    public void print(String title) {
        System.out.println(title);
        if (this.items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(this.items);
            int var10001 = totalPrice;
            System.out.println("\nОбщая стоимость: " + var10001 + " Общий вес: " + this.totalWeight + "\nсредняя цена товара во всех корзинах: " + midPrice() + "\n средняя стоимость корзины: " + midAverPrice());
        }

    }
}
