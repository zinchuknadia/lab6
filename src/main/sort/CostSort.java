package main.sort;

import main.OutPut;
import main.PlayRoom;
import main.Toy;

import java.util.ArrayList;
import java.util.List;

public class CostSort implements SortMenuItem{
    private List<Toy> toyList =  new ArrayList<>(PlayRoom.getPlayRoom().getToyList());

    @Override
    public void execute() {
        toyList.sort((p1,p2) ->Double.compare(p1.getCost(),p2.getCost()));
        OutPut.sortedToys(toyList);
        System.out.println("toys were sorted by cost");
    }
}
