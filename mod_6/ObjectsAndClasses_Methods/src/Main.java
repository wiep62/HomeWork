//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Main {
  public Main() {
  }

  public static void main(String[] args) {
    Basket basket = new Basket();
    Basket basket1 = new Basket();
    Basket basket2 = new Basket();
    Basket basket3 = new Basket();
    Basket basket4 = new Basket();
    Basket basket5 = new Basket();
    basket.add("Gorox", 15, 10, 3.0);
    basket1.add("Xleb", 12, 10, 3.0);
    basket2.add("Moloko", 21, 10, 3.0);
    basket3.add("MAslo", 24, 11, 3.0);
    basket4.add("dca", 12, 10, 1.0);
    basket5.add("dca", 12, 10, 1.0);
    System.out.println(Basket.getCount());
    System.out.println(Basket.midPrice());
    System.out.println(Basket.getTotalPrice());
    System.out.println(basket.getTotalQuanBasket());
    System.out.println(Basket.midAverPrice());
    basket.print("Корзина ");
  }
}
