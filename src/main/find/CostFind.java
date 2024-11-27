package main.find;

import main.OutPut;
import main.PlayRoom;
import main.Toy;

import java.util.ArrayList;
import java.util.List;

public class CostFind implements FindMenuItem{
    List<Toy> toyList = new ArrayList<>(PlayRoom.getPlayRoom().getToyList());

    @Override
    public void execute() {
        List<Double> costRange = OutPut.getCostSpecification();
        List<Toy> foundToyList = new ArrayList<>();
        for(Toy toy : toyList){
            if(toy.getCost()>=costRange.getFirst()&toy.getCost()<=costRange.getLast()){
                foundToyList.add(toy);
            }
        }
        System.out.println("Found toys: ");
        OutPut.outputList(foundToyList);
        System.out.println("Cost category toys were found");
    }
}
