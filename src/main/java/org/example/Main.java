package org.example;

import sources.Users.Administrator;
import sources.Users.Client;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Administrator administrator = new Administrator();
        Client client = new Client();
        boolean flag = true;
        while (flag) {
            System.out.println("""
                    Выберите пользователя:
                    1.Клиент.
                    2.Администратор.
                    3.Выход из програмы.""");
            int pos = scanner.nextInt();
            switch (pos) {
                case 1 -> {
                    client.ClientWork();
                }
                case 2 -> {
                    administrator.administratorWork();
                }
                case 3 -> {
                    flag = false;
                }
            }
        }
    }
}