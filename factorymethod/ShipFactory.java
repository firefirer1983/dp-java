package com.dp.factorymethod;


class ShipFactory {
    public ShipFactory() {
    }

    static public EnemyShip makeShip(String shipType) {
        if(shipType.equals("UFO")) {
            return new Ufo();
        } else if (shipType.equals("Rock")) {
            return new RockShip();
        }
        return null;
    }
}