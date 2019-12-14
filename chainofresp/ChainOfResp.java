package com.dp.chainofresp;


class ChainOfResp {
    public static void main(String[] args) {
        Manager m = new Manager("王经理");
        Director d = new Director("陈总监");
        President p = new President("张总");

        m.setLeader(d);
        d.setLeader(p);
        m.handleRequest(new LeaveRequest("小美", 2, "大姨妈来了"));
        m.handleRequest(new LeaveRequest("小强", 9, "回家相亲"));
        m.handleRequest(new LeaveRequest("小样", 31, "世界那么大，我想去看看"));
    }
}