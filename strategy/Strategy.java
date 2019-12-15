package strategy;


class Strategy {
    public static void main(String[] args) {
        Context ctx = new Context();
        ctx.getDiscout("tom", 400);
        ctx.getDiscout("tom", 600);
        ctx.getDiscout("jack", 400);
        ctx.getDiscout("jack", 600);
    }
}