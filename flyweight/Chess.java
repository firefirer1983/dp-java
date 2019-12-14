package com.dp.flyweight;


class Chess implements IChess {

    private String color;

    public Chess(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void down(Coordinate cord) {
        System.out.println("Chess color: " + this.color + " x:" +cord.getX() + " y:" + cord.getY());
    }
}