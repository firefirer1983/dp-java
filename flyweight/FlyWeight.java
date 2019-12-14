package com.dp.flyweight;


class FlyWeight {
    public static void main(String[] args) {
        ChessFactory cf = new ChessFactory();

        IChess c1 = cf.getChess("black");
        c1.down(new Coordinate(5, 5));

        IChess c2 = cf.getChess("black");
        c2.down(new Coordinate(10, 15));

        System.out.println(c1);
        System.out.println(c2);

    }
}