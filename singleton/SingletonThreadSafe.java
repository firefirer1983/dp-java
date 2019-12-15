package testsingletonthreadsafe;

import java.util.LinkedList;
import java.util.Arrays;
import java.util.Collections;


class SingletonThreadSafe {

    static boolean firstThread = true;

    String[] scrabbleLetters = {"a", "a", "a", "a", "a", "a", "a", "a", "a",
            "b", "b", "c", "c", "d", "d", "d", "d", "e", "e", "e", "e", "e",
            "e", "e", "e", "e", "e", "e", "e", "f", "f", "g", "g", "g", "h",
            "h", "i", "i", "i", "i", "i", "i", "i", "i", "i", "j", "k", "l",
            "l", "l", "l", "m", "m", "n", "n", "n", "n", "n", "n", "o", "o",
            "o", "o", "o", "o", "o", "o", "p", "p", "q", "r", "r", "r", "r",
            "r", "r", "s", "s", "s", "s", "t", "t", "t", "t", "t", "t", "u",
            "u", "u", "u", "v", "v", "w", "w", "x", "y", "y", "z",};

    //1. 需要将构造函数隐藏，防止外部直接调用
    private SingletonThreadSafe() {}

    //2. 由于getInstance函数必须是 static 的，所以导致唯一实例保存的变量也必须是 static 的
    private static SingletonThreadSafe _instance = null;

    private LinkedList<String> letterList = new LinkedList<String>(Arrays.asList(scrabbleLetters));

    static SingletonThreadSafe getInstance() {
        synchronized(SingletonThreadSafe.class) {
            if(_instance == null) {
            // 用锁将语句锁起来，避免多线程重入导致资源竞争. 只要是 SingletonThreadSafe这个类的都会被锁.

                if (firstThread) {
                    //3. 需要立刻将标志清除，不然第二个thread也会sleep 等待.
                    firstThread = false;
                    try {
                        System.out.println("Sleep 1s ...");
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }
                }
                System.out.println("new instance");
                _instance = new SingletonThreadSafe();
                Collections.shuffle(_instance.letterList);
            }
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
}