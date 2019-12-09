package com.dp.factorymethod;


class FactoryMethod {
    public static void main(String[] args) {
        EnemyShip ship = ShipFactory.makeShip("Rock");
        ship.attack();
    }
}