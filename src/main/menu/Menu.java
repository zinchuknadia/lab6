package main.menu;


import main.OutPut;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Menu implements MenuItem {

    protected Map<String, MenuItem> menu;

    public Menu(Map<String, MenuItem> menu) {
        this.menu = menu;
    }

    public Map<String, MenuItem> getMenu() {
        return menu;
    }

    public void executeCommand(String command){
        menu.getOrDefault(command,()->{
            System.out.println("Incorrect command. Try again.");
            System.out.println("Available commands: " + getAvailableCommands());
        }).execute();
    }

    public Set<String> getAvailableCommands(){
        return menu.keySet();
    }

    @Override
    public void execute() {
        OutPut.parameterMenu(menu);
        Scanner sc = new Scanner(System.in);
        String command = sc.nextLine();
        executeCommand(command);
    }

}
