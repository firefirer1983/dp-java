package com.dp.observer;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

class WeChatGroup implements Subject {

    String name;
    HashMap<String, IObserver> groupMember = new HashMap<String, IObserver>();

    public WeChatGroup(String name) {
        this.name = name;
    }

    public void register(IObserver member) {
        groupMember.put(member.getName(), member);
    }

    public void notify(String sender, String msg) {
        for(String name : groupMember.keySet()) {
            if(name != sender) {
                IObserver member = groupMember.get(name);
                member.receive(sender + " :" + msg);
            }
        }
    }
}