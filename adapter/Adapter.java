package com.dp.adapter;

class Adapter {
    public static void main(String[] args) {
        RoundHole rh = new RoundHole(3.0);

        RoundPeg rp1 = new RoundPeg(2.1);
        RoundPeg rp2 = new RoundPeg(3.1);
        System.out.println("round peg 1 fits:" + rh.fits(rp1));
        System.out.println("round peg 2 fits:" + rh.fits(rp2));
        SquarePegAdapter sp1 = new SquarePegAdapter(new SquarePeg(4.2));
        SquarePegAdapter sp2 = new SquarePegAdapter(new SquarePeg(4.3));
        System.out.println("square peg 1 fits:" + rh.fits(rp1));
        System.out.println("square peg 2 fits:" + rh.fits(rp2));

    }
}