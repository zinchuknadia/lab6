import main.menu.MainMenu;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        while(true) {
            MainMenu mainMenu = new MainMenu();
            Scanner sc = new Scanner(System.in);
            String command = sc.nextLine();
            mainMenu.executeCommand(command);
        }
    }
}