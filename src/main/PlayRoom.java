package main;

import java.util.ArrayList;
import java.util.List;

public class PlayRoom {
    private static PlayRoom playRoom = new PlayRoom();

    private List<Toy> toyList = new ArrayList<>();

    public static PlayRoom getPlayRoom() {
        return playRoom;
    }

    public List<Toy> getToyList() {
        return toyList;
    }

    public void setToyList(List<Toy> toyList) {
        playRoom.toyList = toyList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        for(Toy toy : toyList){
            sb.append(toy).append("\n");
        }
        return sb.toString();
    }
}
