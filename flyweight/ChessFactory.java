package com.dp.flyweight;
import java.util.HashMap;

class ChessFactory {

    HashMap<String, IChess> chessPool = new HashMap<String, IChess>();

    IChess getChess(String color) {
        if(! chessPool.containsKey(color)) {
            chessPool.put(color, new Chess(color));
        }
        return chessPool.get(color);
    }
}