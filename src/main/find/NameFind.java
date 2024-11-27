package main.find;

import main.OutPut;
import main.PlayRoom;
import main.Toy;

import java.util.*;

public class NameFind implements FindMenuItem{
    List<Toy> toyList = new ArrayList<>(PlayRoom.getPlayRoom().getToyList());

    public Set<String> formMenu(){
        Set<String> names = new HashSet<>();
        for (Toy toy : toyList) {
            names.add(toy.getName());
        }
        return names;
    }

    @Override
    public void execute() {
        Set<String> names = formMenu();
        String name = OutPut.getParameterSpecification(names);
        List<Toy> foundToyList = new ArrayList<>();
        for(Toy toy : toyList){
            if(toy.getName().equals(name)){
                foundToyList.add(toy);
            }
        }
        System.out.println("Found toys: ");
        OutPut.outputList(foundToyList);
        System.out.println("Name category toys were found");
    }
}
