package main.find;

import main.OutPut;
import main.PlayRoom;
import main.Toy;

import java.util.*;

public class ColorFind implements FindMenuItem{
    List<Toy> toyList = new ArrayList<>(PlayRoom.getPlayRoom().getToyList());

    public Set<String> formMenu(){
        Set<String> colors = new HashSet<>();
        for (Toy toy : toyList) {
            colors.add(toy.getColor());
        }
        return colors;
    }

    @Override
    public void execute() {
        Set<String> colors = formMenu();
        String color = OutPut.getParameterSpecification(colors);
        List<Toy> foundToyList = new ArrayList<>();
        for(Toy toy : toyList){
            if(toy.getColor().equals(color)){
                foundToyList.add(toy);
            }
        }
        System.out.println("Found toys: ");
        OutPut.outputList(foundToyList);
        System.out.println("Color category toys were found");
    }
}
