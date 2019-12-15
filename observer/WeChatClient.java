package com.dp.observer;


class WeChatClient extends IObserver {
    Subject subject;

    public WeChatClient(String name) {
        super(name);
    }

    public void join(Subject subject) {
        this.subject = subject;
        this.subject.register(this);
    }

    public void receive(String msg) {
        System.out.println(this.getName() + " get wechat group message: " + msg);
    }

    public void send(String msg) {
        subject.notify(this.getName(), msg);
    }
}