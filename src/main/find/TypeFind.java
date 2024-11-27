package main.find;

import main.OutPut;
import main.PlayRoom;
import main.Toy;

import java.util.*;

public class TypeFind implements FindMenuItem{
    List<Toy> toyList = new ArrayList<>(PlayRoom.getPlayRoom().getToyList());

    public Set<String> formMenu(){
        Set<String> types = new HashSet<>();
        for (Toy toy : toyList) {
            types.add(toy.getType());
        }
        return types;
    }

    @Override
    public void execute() {
        Set<String> types = formMenu();
        String type = OutPut.getParameterSpecification(types);
        List<Toy> foundToyList = new ArrayList<>();
        for(Toy toy : toyList){
            if(toy.getType().equals(type)){
                foundToyList.add(toy);
            }
        }
        System.out.println("Found toys: ");
        OutPut.outputList(foundToyList);
        System.out.println("Type category toys were found");
    }
}
