package sources.Users;

import service.CreateOrder;
import sources.Menu.Menu;

import java.util.Scanner;

public class Administrator {

     public void administratorWork() {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        Client client = new Client();
        CreateOrder order = new CreateOrder();
        System.out.println("""
                Меню управления администратора.
                1.Добавить пункты в меню.
                2.Подвердить заказ.
                3.Подвердить оплату.
                4.Выход.
                """);
        int pos = scanner.nextInt();
        switch (pos) {
            case 1 -> {
                menu.addItem();
            }
            case 2 -> {
                order.printOrder();
            }
            case 3 -> {
                approvePayment(client.payment(order.getPrices()));
            }
            case 4 -> {
            }
        }
    }

    public void approvePayment(boolean payment){
         if(payment) {
             System.out.println("Платёж подверждён.");
         }else{
             System.out.println("Счёт не оплачен");
         }
        System.out.println("""
                Подвердить заказ?
                1.да
                2.нет
                """);
        Scanner scanner = new Scanner(System.in);
        int pos = scanner.nextInt();
        switch (pos) {
            case 1 -> {
                System.out.println("Оплата одобрена.");
            }
            case 2 -> {
                System.out.println("Оплата не прошла.");
            }
        }
    }
}
