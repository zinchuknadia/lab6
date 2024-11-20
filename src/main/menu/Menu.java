package main.menu;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Menu implements MenuItem {

    private static Map<String, MenuItem> menu=new LinkedHashMap<>();

    public Menu(){}

    public Menu(Map<String, MenuItem> menu){
        Menu.menu =menu;
    }

    public static void setMenu(Map<String, MenuItem> menu) {
        Menu.menu = menu;
    }

    public static void executeCommand(String command){
        menu.getOrDefault(command,()->{
            System.out.println("Incorrect command. Try again.");
            System.out.println("Available commands: " + getAvailableCommands());
        }).execute();
    }

    public static Set<String> getAvailableCommands(){
        return menu.keySet();
    }

    @Override
    public void execute() {
        Scanner sc = new Scanner(System.in);
        String command = sc.nextLine();
        executeCommand(command);
    }

}
