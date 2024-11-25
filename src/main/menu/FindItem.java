package main.menu;

import main.find.AgeFind;
import main.find.SizeFind;
import main.find.*;

import java.util.LinkedHashMap;

public class FindItem extends Menu {

    public FindItem() {
        super(new LinkedHashMap<>());

        menu.put("size", new SizeFind());
        menu.put("color", new ColorFind());
        menu.put("age", new AgeFind());
        menu.put("material", new MaterialFind());
    }
}
