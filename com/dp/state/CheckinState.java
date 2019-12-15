package com.dp.state;

class CheckinState implements RoomState {

    Room room;

    public CheckinState(Room room) {
        this.room = room;
    }

    public void checkin() {
        System.out.println("checkin success!");
    }

    public void unbook() {
        System.out.println("No unbook after checkin, sorry!");
    }

    public void checkout() {
        room.changeState(new VacancyState(room));
        System.out.println(room.num +" checkout success!");
    }

    public void book() {
        System.out.println("You've already checkin, book is unnecessary!");
    }
}