package observer;


class Observer {

    public static void main(String[] args) {

        WeChatClient xy = new WeChatClient("xy");
        WeChatClient yao = new WeChatClient("yao");
        WeChatClient jay = new WeChatClient("jay");

        Subject python = (Subject)(new WeChatGroup("python rock group"));
        xy.join(python);
        yao.join(python);
        jay.join(python);

        xy.send("I love python");
        jay.send("Me too!");

    }
}