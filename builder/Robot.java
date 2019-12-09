package com.dp.builder;


public class Robot implements RobotPlan {

    private String head;
    private String legs;
    private String hands;

    public String getHead() {
        return head;
    }

    public String getLegs() {
        return legs;
    }

    public String getHands() {
        return hands;
    }

    @Override
    public void setHead(String head) {
        this.head = head;
    }

    @Override
    public void setLegs(String legs) {
        this.legs = legs;
    }

    @Override
    public void setHands(String hands) {
        this.hands = hands;
    }
}
