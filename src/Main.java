import main.OutPut;
import main.menu.MainMenu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            MainMenu mainMenu = new MainMenu();
            OutPut.parameterMenu(mainMenu.getMenu());
            String command = sc.nextLine();
            mainMenu.executeCommand(command);
            sc.nextLine();
        }
    }

}