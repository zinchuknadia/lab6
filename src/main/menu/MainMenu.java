package main.menu;

import java.util.LinkedHashMap;

public class MainMenu extends Menu {

    public MainMenu() {
        super(new LinkedHashMap<>());

        menu.put("add",new AddItem());
        menu.put("sort",new SortItem());
        menu.put("find",new FindItem());
        menu.put("delete",new DeleteItem());
        menu.put("start",new StartItem());
        menu.put("exit",new ExitItem());
    }
}
