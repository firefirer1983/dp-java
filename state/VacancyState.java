package state;

class VacancyState implements RoomState {

    Room room;

    public VacancyState(Room room) {
        this.room = room;
    }

    public void checkin() {
        room.changeState(new BookedState(room));
        room.changeState(new CheckinState(room));
    }

    public void unbook() {
        System.out.println("You need to book the room first");
    }

    public void checkout() {
        System.out.println("You need to book the room first");
    }

    public void book() {
        room.changeState(new BookedState(room));
    }
}