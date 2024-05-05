package Util;

import Main.Library;

import java.util.Scanner;

public class MenuUtil {

    static Library library = new Library();

    public static void showMenu() {
        library.login();
        Menu.menu();
        int selected = 0;
        while (true) {
            selected = InputUtil.requareNumber("---------------");
            switch (selected) {
                case 1 -> {
                    library.showAllbooks();
                    Menu.menu();
                }
                case 2 -> {
                    library.getBooksInfo();
                    Menu.menu();
                }
                case 3 -> {
                    library.addBook();
                    Menu.menu();
                }
                case 4 -> {
                    library.removeBook();
                    Menu.menu();
                }
                case 5 -> {
                    library.findBookAndPrintInfo();
                    Menu.menu();
                }
                case 6 -> System.exit(0);
                case 7 -> showMenu();
                default -> System.out.println("Enter valid number:");
            }

        }
    }
}
