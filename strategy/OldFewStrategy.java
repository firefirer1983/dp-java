package com.dp.strategy;


class OldFewStrategy implements IStrategy {

    public double getPrice(double stdPrice) {
        System.out.println("客户小批量打9折!");
        return stdPrice*0.9;
    }
}