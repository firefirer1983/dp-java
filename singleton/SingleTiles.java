package singletiles;

import java.util.LinkedList;
import java.util.Arrays;
import java.util.Collections;


class SingleTiles {

    boolean firstThread = true;

    String[] scrabbleLetters = {"a", "a", "a", "a", "a", "a", "a", "a", "a",
            "b", "b", "c", "c", "d", "d", "d", "d", "e", "e", "e", "e", "e",
            "e", "e", "e", "e", "e", "e", "e", "f", "f", "g", "g", "g", "h",
            "h", "i", "i", "i", "i", "i", "i", "i", "i", "i", "j", "k", "l",
            "l", "l", "l", "m", "m", "n", "n", "n", "n", "n", "n", "o", "o",
            "o", "o", "o", "o", "o", "o", "p", "p", "q", "r", "r", "r", "r",
            "r", "r", "s", "s", "s", "s", "t", "t", "t", "t", "t", "t", "u",
            "u", "u", "u", "v", "v", "w", "w", "x", "y", "y", "z",};

    //1. 需要将构造函数隐藏，防止外部直接调用
    private SingleTiles() {}

    //2. 由于getInstance函数必须是 static 的，所以导致唯一实例保存的变量也必须是 static 的
    private static SingleTiles _instance = null;

    private LinkedList<String> letterList = new LinkedList<String>(Arrays.asList(scrabbleLetters));

    static SingleTiles getInstance() {
        if(_instance == null) {
            try {
                System.out.println("Sleep 1s ...");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }

            _instance = new SingleTiles();
            Collections.shuffle(_instance.letterList);
        }
        return _instance;
    }

    public LinkedList<String> getLetterList() {
        return this.letterList;
    }

    public LinkedList<String> getTiles(int num) {
        LinkedList<String> tiles = new LinkedList<String>();
        for ( int i = 0; i < num; i ++ ){
            tiles.add(letterList.remove(0));
        }
        return tiles;
    }

    public static void main(String[] args) {
        SingleTiles s = SingleTiles.getInstance();
        System.out.println("instance: " + System.identityHashCode(s));
        System.out.println("letters: " + s.getLetterList());
        System.out.println("tiles: " + s.getTiles(7));
        System.out.println(s.getLetterList());
        s = SingleTiles.getInstance();
        System.out.println("instance: " + System.identityHashCode(s));
        System.out.println("letters left: " + s.getLetterList());
    }
}