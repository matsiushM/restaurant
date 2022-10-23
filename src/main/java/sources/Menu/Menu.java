package sources.Menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private static final List<menuItem> spisok = new ArrayList<>();
    private static int id = 1;
    public void addItem() {
        menuItem item = new menuItem();
        Scanner scanner = new Scanner(System.in);

        item.setId(id++);
        System.out.println("Введите названия блюда: ");
        String name = scanner.next();
        item.setName(name);

        System.out.println("Введите цену блюда: ");
        int price = scanner.nextInt();
        item.setPrices(price);

        System.out.println("Введите описания: ");
        String descriptions = scanner.next();
        item.setDescriptions(descriptions);

        spisok.add(item);

    }

    public void printMenu() {
        print(spisok);
    }

    public static void print(List<menuItem> spisok) {
        for (menuItem menuItem : spisok) {
            System.out.println("___________________________________________________");
            System.out.println("Номер позиции: "  + menuItem.getId());
            System.out.println("Названия блюда: " + menuItem.getName());
            System.out.println("Описания: "       +menuItem.getDescriptions());
            System.out.println("Цена блюда: "     + menuItem.getPrices());
        }
    }

    protected static class menuItem {

        private int id;
        private int prices;
        private String name;
        private String descriptions;

        public void setId(int id){this.id = id;}

        public int getId() {
            return id;
        }

        public int getPrices() {
            return prices;
        }

        public void setPrices(int prices) {
            this.prices = prices;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescriptions() {
            return descriptions;
        }

        public void setDescriptions(String descriptions) {
            this.descriptions = descriptions;
        }

    }

    public List<menuItem> getSpisok() {
        return spisok;
    }
}

