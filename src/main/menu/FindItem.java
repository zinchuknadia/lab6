package main.menu;

import main.find.SizeFind;
import main.find.*;

import java.util.LinkedHashMap;

public class FindItem extends Menu {

    public FindItem() {
        super(new LinkedHashMap<>());

        menu.put("size", new SizeFind());
        menu.put("color", new ColorFind());
        menu.put("material", new MaterialFind());
        menu.put("name", new NameFind());
        menu.put("type", new TypeFind());
        menu.put("cost", new CostFind());
    }

    @Override
    public void execute() {
        System.out.println("Choose parameter: ");
        super.execute();
    }
}
