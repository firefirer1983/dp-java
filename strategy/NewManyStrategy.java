package strategy;


class NewManyStrategy implements IStrategy {

    public double getPrice(double stdPrice) {
        System.out.println("新客户大批量打8折!");
        return stdPrice*0.85;
    }
}