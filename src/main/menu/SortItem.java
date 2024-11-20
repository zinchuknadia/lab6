package main.menu;

import main.sort.*;

import java.util.LinkedHashMap;
import java.util.Map;

public class SortItem extends Menu {

    private static Map<String, MenuItem> menu=new LinkedHashMap<>();

    public SortItem() {
        super();
    }

    public void setMenu() {
        menu();
        setMenu(menu);
    }

    public static void menu(){
        menu.put("size", new SizeSort());
        menu.put("color", new ColorSort());
        menu.put("age", new AgeSort());
        menu.put("material", new MaterialSort());
    }

    @Override
    public void execute() {
        setMenu();
        super.execute();
    }
}
