package main.menu;

import java.util.LinkedHashMap;
import java.util.Map;

public class MainMenu extends Menu {

    private static Map<String, MenuItem> menu=new LinkedHashMap<>();

    public MainMenu() {
        super(menu);
    }

    public static void setMenu() {
        menu();
        setMenu(menu);
    }

    public static void menu() {
        menu.put("add",new AddItem());
        menu.put("sort",new SortItem());
        menu.put("find",new FindItem());
        menu.put("delete",new DeleteItem());
        menu.put("start",new StartItem());
        menu.put("exit",new ExitItem());
    }

}
