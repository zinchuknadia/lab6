package main.menu;

import main.Budget;

public class ShowBudgetItem implements MenuItem{
    Budget budget = Budget.getBudget();
    @Override
    public void execute() {
        System.out.println("Your budget is " + budget.getSum());
    }
}
