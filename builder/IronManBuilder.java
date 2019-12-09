package com.dp.builder;

public class IronManBuilder implements RobotBuilder{

    private Robot robot;

    public IronManBuilder() {
        this.robot = new Robot();
    }

    @Override
    public Robot getRobot() {
        return this.robot;
    }

    @Override
    public void buildHead() {
        this.robot.setHead("Big iron head");
    }

    @Override
    public void buildHands() {
        this.robot.setHands("Big iron hammer");
    }

    @Override
    public void buildLegs() {
        this.robot.setLegs("Big iron roller skates");
    }
}
