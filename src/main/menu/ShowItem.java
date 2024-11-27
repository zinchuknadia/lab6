package main.menu;

import main.PlayRoom;

public class ShowItem implements MenuItem{
    PlayRoom playRoom = PlayRoom.getPlayRoom();

    @Override
    public void execute() {
        System.out.print(playRoom);
    }
}
