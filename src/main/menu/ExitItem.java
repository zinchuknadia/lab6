package main.menu;

public class ExitItem implements MenuItem {
    @Override
    public void execute() {
        System.out.println("Exiting program");
        System.exit(0);
    }
}
