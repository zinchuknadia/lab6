package main.menu;

import main.PlayRoom;
import main.Toy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileReadItem implements MenuItem{
    private String filePath = "D:\\юнівер\\3_семестр\\пп_лаби\\lab_file.txt";
    List<Toy> toyList = PlayRoom.getPlayRoom().getToyList();

    @Override
    public void execute() {
        toyList.addAll(readFile());
        System.out.println("File was read");
    }

    public List<Toy> readFile(){
        List<Toy> toyList = new ArrayList<>();

        try {
            List<String> lines = Files.readAllLines(Paths.get(filePath));
            for (String line : lines) {
                String[] details = line.split(";");
                String name = details[0];
                String type = details[1];
                String color =details[2];
                String size=details[3];
                String material = details[4];
                Double cost = Double.valueOf(details[5]);
                toyList.add(new Toy(name, type, color, size, material, cost));
            }
        }catch (IOException e){
                e.printStackTrace();
            }
        return toyList;
    }
}
