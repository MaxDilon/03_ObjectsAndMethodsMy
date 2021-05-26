public class Main {
    public static void main(String[] args) {
        Basket vasyaBasket = new Basket();

        vasyaBasket.add("Молоко", 80,2);
        vasyaBasket.add("Хлеб", 60,3,300);
        vasyaBasket.add("Масло", 150,4,100);

        vasyaBasket.print("Корзина Васи");
        System.out.println("Общий вес корзины: " + vasyaBasket.getTotalWeight() + " грамм");
        System.out.println("СТОИМОСТЬ: " + vasyaBasket.getTotalPrice() + " руб.");

        vasyaBasket.clear();
        System.out.println();
        vasyaBasket.print("Корзина Васи");
        System.out.println("Общий вес корзины: " + vasyaBasket.getTotalWeight() + " грамм");
        System.out.println("СТОИМОСТЬ: " + vasyaBasket.getTotalPrice() + " руб.");
    }
}
