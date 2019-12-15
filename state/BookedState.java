package com.dp.state;


class BookedState implements IState {
    public void handle() {
        System.out.println("房间已预定");
    }
}