package command;

class Command {
    public static void main(String[] args) {
        Invoker ivk = new Invoker();
        ivk.execute(new CopyCommand());
        ivk.execute(new PasteCommand());
        ivk.commit();
    }
}