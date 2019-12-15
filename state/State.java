package state;

class State {
    public static void main(String[] args) {
        Room room = new Room(301);
        room.book();
        room.checkin();
        room.checkout();

    }
}