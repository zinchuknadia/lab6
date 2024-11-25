package main.menu;

import main.sort.*;

import java.util.LinkedHashMap;

public class SortItem extends Menu {

    public SortItem() {
        super(new LinkedHashMap<>());

        menu.put("size", new SizeSort());
        menu.put("color", new ColorSort());
        menu.put("age", new AgeSort());
        menu.put("material", new MaterialSort());
    }
}
