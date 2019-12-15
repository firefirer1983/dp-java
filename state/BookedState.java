package state;

class BookedState implements RoomState {

    Room room;

    public BookedState(Room room) {
        this.room = room;
    }

    public void checkin() {
        this.room.changeState(new CheckinState(room));
    }

    public void unbook() {
        this.room.changeState(new VacancyState(room));
    }

    public void checkout() {
        unbook();
    }

    public void book() {
        System.out.println("Room booked success!");
    }
}