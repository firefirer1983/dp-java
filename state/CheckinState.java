package com.dp.state;


class CheckinState implements IState {
    public void handle() {
        System.out.println("房间已入住");
    }
}