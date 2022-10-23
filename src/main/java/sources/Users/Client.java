package sources.Users;

import service.CreateOrder;
import sources.Menu.Menu;

import java.util.Scanner;

public class Client {

    public void ClientWork() {
        Scanner scanner = new Scanner(System.in);
        CreateOrder order = new CreateOrder();
        Menu menu = new Menu();
        System.out.println("""
                Меню управления администратора.
                1.Получить меню.
                2.Сделать заказ.
                3.Оплатить заказ.
                4.Выход.
                """);
        int pos = scanner.nextInt();
        switch (pos) {
            case 1 -> {
                menu.printMenu();
            }
            case 2 -> {
                order.Order();
                order.printOrder();
            }
            case 3 -> {
                System.out.println(order.getPrices());
                payment(order.getPrices());
            }
        }
    }

    public boolean payment(int account){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввудите сумму оплаты: ");
        int price = scanner.nextInt();
        if (price == account){
            System.out.println("Платёж одобрен.");
            return true;
        }
        else {
            System.out.println("Платёж не прошел, сумма оплаты недостаточна");
            return false;
        }
    }
}
