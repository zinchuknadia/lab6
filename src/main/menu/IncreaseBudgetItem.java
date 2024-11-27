package main.menu;

import main.Budget;
import main.OutPut;

public class IncreaseBudgetItem implements MenuItem{
    Budget budget = Budget.getBudget();

    @Override
    public void execute() {
        Double sum = OutPut.getBudget();
        budget.setSum(budget.getSum()+sum);
        System.out.println("Budget was increased");
    }
}
