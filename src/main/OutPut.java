package main;

import main.menu.MenuItem;

import java.util.*;

public class OutPut {
    private static PlayRoom playRoom = PlayRoom.getPlayRoom();


    public static String getName(){
        System.out.println("Name: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    public static String getType(){
        System.out.println("Type: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    public static String getColor(){
        System.out.println("Color: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    public static String getSize(){
        System.out.println("Size: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    public static String getMaterial(){
        System.out.println("Material: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    public static double getCost(){
        System.out.println("Cost: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    public static Toy chooseToy(){
        System.out.println("Choose toy: \n");
        List<Toy> toyList = playRoom.getToyList();
        for (int i = 0; i < toyList.size(); i++) {
            System.out.print(i+1 + " " + toyList.get(i) + "\n");
        }
        Scanner scanner = new Scanner(System.in);
        return toyList.get(scanner.nextInt()-1);
    }

    public static Double getBudget() {
        System.out.println("Enter budget: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    public static void sortedToys(List<Toy> toyList) {
        System.out.println("Sorted list: ");
        StringBuilder sb = new StringBuilder();
        for(Toy toy : toyList){
            sb.append(toy).append("\n");
        }
        System.out.println(sb);
    }

    public static void parameterMenu(Map<String, MenuItem>  menu) {
        Set<String> keySet = menu.keySet();
        for(int i=0;i<keySet.size();i++){
            System.out.println(i+1 + " " + keySet.toArray()[i]);
        }
    }

    public static String getParameterSpecification(Set<String> set) {
        System.out.println("Choose specification: ");
        for(int i=0;i<set.size();i++){
            System.out.println(i+1 + " " + set.toArray()[i]);
        }
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static List<Double> getCostSpecification() {
        List<Double> interval = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose cost range: ");
        System.out.println("Enter left boundary: ");
        interval.add(scanner.nextDouble());
        System.out.println("Enter right boundary: ");
        interval.add(scanner.nextDouble());
        return interval;
    }

    public static void outputList(List<Toy> toyList){
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        for(Toy toy : toyList){
            sb.append(toy).append("\n");
        }
        System.out.println(sb);
    }
}
