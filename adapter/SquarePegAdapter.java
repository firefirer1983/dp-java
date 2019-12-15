package adapter;
import java.lang.Math;


class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg = null;
    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
        double width = this.peg.getWidth();
        this.radius = Math.sqrt(Math.pow(width, 2)/2);
    }
}