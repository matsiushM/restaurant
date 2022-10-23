package service;

import sources.Menu.Menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CreateOrder extends Menu {

    private static final List<menuItem> menuItemOrder = new ArrayList<>();

    public List<menuItem> Order() {
        Menu menu = new Menu();
        //List<menuItem> menuItemOrder = new ArrayList<>();
        List<menuItem> itemOrder = menu.getSpisok();
        Scanner scanner = new Scanner(System.in);
        boolean sost = true;
        while (sost) {
            System.out.println("Выберите позиции для заказа: ");
            int pos = scanner.nextInt();
            for (menuItem item : itemOrder) {
                if (item.getId() == pos) {
                    menuItemOrder.add(item);
                }
            }
            System.out.println("""
                    Что то ещё?
                    1. нет
                    2. да
                    """);
            if (scanner.nextInt() == 1) {
                sost = false;
            }
        }
        return menuItemOrder;
    }

    public int getPrices(){
        int prices =0;
        for (menuItem item: menuItemOrder) {
           prices += item.getPrices();
        }
        return prices;
    }

    public void printOrder() {

        Menu.print(menuItemOrder);
        System.out.println("Сумма заказа: " + getPrices());
    }


}
