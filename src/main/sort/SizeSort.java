package main.sort;

import main.OutPut;
import main.PlayRoom;
import main.Toy;

import java.util.ArrayList;
import java.util.List;

public class SizeSort implements SortMenuItem{
    private List<Toy> toyList =  new ArrayList<>(PlayRoom.getPlayRoom().getToyList());

    @Override
    public void execute() {
        toyList.sort((p1,p2) ->p2.getSize().compareTo(p1.getSize()));
        OutPut.sortedToys(toyList);
        System.out.println("toys were sorted by size");
    }
}
