package main;

public class Budget {
    private static Budget budget = new Budget();

    private double sum;

    public Budget(){
        this.sum = 0;
    }

    public static Budget getBudget() {
        return budget;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

}
