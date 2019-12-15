package strategy;


class NewFewStrategy implements IStrategy {

    public double getPrice(double stdPrice) {
        System.out.println("新客户小批量不打折!");
        return stdPrice;
    }
}