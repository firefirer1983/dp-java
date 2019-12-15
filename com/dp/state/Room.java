package com.dp.state;


class Room {
    public int num;
    public RoomState state = new VacancyState(this);
    public Room(int num) {
        this.num = num;
    }

    public void changeState(RoomState state) {
        this.state = state;
    }

    public void book() {
        this.state.book();
    }

    public void unbook() {
        this.state.unbook();
    }

    public void checkin() {
        this.state.checkin();
    }

    public void checkout() {
        this.state.checkout();
    }
}