package main.menu;

import java.util.LinkedHashMap;

public class MainMenu extends Menu {

    public MainMenu() {
        super(new LinkedHashMap<>());

        menu.put("add",new AddItem());
        menu.put("sort",new SortItem());
        menu.put("find",new FindItem());
        menu.put("delete",new DeleteItem());
        menu.put("show",new ShowItem());
        menu.put("exit",new ExitItem());
        menu.put("read file",new FileReadItem());
        menu.put("show budget",new ShowBudgetItem());
        menu.put("increase budget",new IncreaseBudgetItem());
    }
}
