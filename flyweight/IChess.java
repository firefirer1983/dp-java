package com.dp.flyweight;

public interface IChess {
    void down(Coordinate cord);
    String getColor();
    void setColor(String c);
}