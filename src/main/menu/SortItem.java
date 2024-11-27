package main.menu;
import main.sort.*;
import java.util.LinkedHashMap;

public class SortItem extends Menu {

    public SortItem() {
        super(new LinkedHashMap<>());

        menu.put("size", new SizeSort());
        menu.put("color", new ColorSort());
        menu.put("material", new MaterialSort());
        menu.put("name", new NameSort());
        menu.put("type", new TypeSort());
        menu.put("cost", new CostSort());
    }

    @Override
    public void execute() {
        System.out.println("Choose parameter: ");
        super.execute();
    }
}
