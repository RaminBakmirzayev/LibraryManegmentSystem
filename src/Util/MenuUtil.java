package Util;

import Main.Library;

import java.util.Scanner;

public class MenuUtil {

    static Library library = new Library();

    public static void showMenu() {
        library.login();
        Menu.menu();
        int selected = InputUtil.requareNumber("---------------");
        if (selected == 1) {
            library.showAllbooks();
        } else if (selected == 2) {
            library.getBooksInfo();
        } else if (selected == 3) {
            library.addBook();

        } else if (selected == 4) {
            library.removeBook();
        } else if (selected == 5) {

        }

    }
}
