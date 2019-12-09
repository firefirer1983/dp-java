package com.dp.singleton;

class Singleton {

    private String name;

    //1. 需要将构造函数隐藏，防止外部直接调用
    private Singleton(String name) {
        this.name = name;
    };

    //2. 由于getInstance函数必须是 static 的，所以导致唯一实例保存的变量也必须是 static 的
    private static Singleton _instance = null;

    static Singleton getInstance(String name) {
        if(_instance == null) {
            _instance = new Singleton(name);
        }
        return _instance;
    }

    public void display() {
        System.out.println(this.name);
    }

    public static void main(String[] args) {
        System.out.println("Singleton:");
        Singleton s = Singleton.getInstance("xy");
        s.display();
        s = Singleton.getInstance("xiaoxiao");
        s.display();
    }
}