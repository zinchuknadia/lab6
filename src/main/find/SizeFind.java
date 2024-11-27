package main.find;

import main.OutPut;
import main.PlayRoom;
import main.Toy;

import java.util.*;

public class SizeFind implements FindMenuItem{
    List<Toy> toyList = new ArrayList<>(PlayRoom.getPlayRoom().getToyList());

    public Set<String> formMenu(){
        Set<String> sizes = new HashSet<>();
        for (Toy toy : toyList) {
            sizes.add(toy.getSize());
        }
        return sizes;
    }

    @Override
    public void execute() {
        Set<String> sizes = formMenu();
        String size = OutPut.getParameterSpecification(sizes);
        List<Toy> foundToyList = new ArrayList<>();
        for(Toy toy : toyList){
            if(toy.getSize().equals(size)){
                foundToyList.add(toy);
            }
        }
        System.out.println("Found toys: ");
        OutPut.outputList(foundToyList);
        System.out.println("Size category toys were found");
    }
}