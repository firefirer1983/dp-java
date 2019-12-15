package com.dp.state;


class VacancyState implements IState {
    public void handle() {
        System.out.println("房间空闲");
    }
}