package main.menu;

import main.Budget;
import main.OutPut;
import main.PlayRoom;
import main.Toy;

import java.util.ArrayList;
import java.util.List;

public class AddItem implements MenuItem {
    private Budget budget=Budget.getBudget();
    private PlayRoom playRoom = PlayRoom.getPlayRoom();
    private List<Toy> toyList = new ArrayList<>(playRoom.getToyList());

    @Override
    public void execute() {
        addToy();
    }

    public void addToy(){
        Toy toy = createToy();
        boolean isAvailable = checkBudget(toy);
        if (isAvailable) {
            budget.setSum(budget.getSum()- toy.getCost());
            toyList.add(toy);
            playRoom.setToyList(toyList);
            System.out.println("toy was added");
        }else{
            System.out.println("Not enough money. Try to make more.");
        }
    }

    public boolean checkBudget(Toy toy){
        return toy.getCost()<=budget.getSum();
    }

    public Toy createToy(){
        String name = OutPut.getName();
        String type = OutPut.getType();
        String color = OutPut.getColor();
        String size = OutPut.getSize();
        String material = OutPut.getMaterial();
        Double cost = OutPut.getCost();
        return new Toy(name,type,color,size,material,cost);
    }
}
