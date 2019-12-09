package com.dp.builder;

public class TestBuilder {
    private static Robot makeRobot() {
        RobotBuilder builder = new IronManBuilder();
        builder.buildHead();
        builder.buildHands();
        builder.buildLegs();
        return builder.getRobot();

    }
    public static void main(String[] args) {
        Robot ironman = makeRobot();
        System.out.println(ironman.getHead());
        System.out.println(ironman.getHands());
        System.out.println(ironman.getLegs());
    }
}
