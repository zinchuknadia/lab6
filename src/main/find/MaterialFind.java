package main.find;

import main.OutPut;
import main.PlayRoom;
import main.Toy;

import java.util.*;

public class MaterialFind implements FindMenuItem{
    List<Toy> toyList = new ArrayList<>(PlayRoom.getPlayRoom().getToyList());

    public Set<String> formMenu(){
        Set<String> materials = new HashSet<>();
        for (Toy toy : toyList) {
            materials.add(toy.getMaterial());
        }
        return materials;
    }

    @Override
    public void execute() {
        Set<String> materials = formMenu();
        String material = OutPut.getParameterSpecification(materials);
        List<Toy> foundToyList = new ArrayList<>();
        for(Toy toy : toyList){
            if(toy.getMaterial().equals(material)){
                foundToyList.add(toy);
            }
        }
        System.out.println("Found toys: ");
        OutPut.outputList(foundToyList);
        System.out.println("Material category toys were found");
    }
}
