package main.menu;

import main.find.AgeFind;
import main.find.SizeFind;
import main.find.*;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindItem extends Menu {

    private static Map<String, MenuItem> menu= new LinkedHashMap<>();

    public FindItem() {
        super();
    }

    public void setMenu() {
        menu();
        setMenu(menu);
    }

    public static void menu(){
        menu.put("size", new SizeFind());
        menu.put("color", new ColorFind());
        menu.put("age", new AgeFind());
        menu.put("material", new MaterialFind());
    }

    @Override
    public void execute() {
        setMenu();
        super.execute();
    }
}
