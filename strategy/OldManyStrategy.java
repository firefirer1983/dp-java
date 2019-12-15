package com.dp.strategy;


class OldManyStrategy implements IStrategy {

    public double getPrice(double stdPrice) {
        System.out.println("客户大批量打85折!");
        return stdPrice*0.85;
    }
}