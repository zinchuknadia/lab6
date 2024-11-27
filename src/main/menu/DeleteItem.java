package main.menu;

import main.OutPut;
import main.PlayRoom;
import main.Toy;

import java.util.ArrayList;
import java.util.List;

public class DeleteItem implements MenuItem {
    private PlayRoom playRoom = PlayRoom.getPlayRoom();
    private List<Toy> toyList = new ArrayList<>(playRoom.getToyList());


    @Override
    public void execute() {
        deleteToy();
        System.out.println("toy was deleted");
    }

    public void deleteToy(){
        Toy toy = OutPut.chooseToy();
        toyList.remove(toy);
        playRoom.setToyList(toyList);
    }

}
