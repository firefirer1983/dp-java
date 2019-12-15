package com.dp.state;

class BookedState implements RoomState {

    Room room;

    public BookedState(Room room) {
        this.room = room;
    }

    public void checkin() {
        this.room.changeState(new CheckinState(room));
        System.out.println(room.num + " checkin success!");
    }

    public void unbook() {
        this.room.changeState(new VacancyState(room));
        System.out.println(room.num + " unbook success!");
    }

    public void checkout() {
        unbook();
        System.out.println(room.num + " unbook success!");
    }

    public void book() {
        System.out.println("Room booked success!");
    }
}