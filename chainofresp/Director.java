package com.dp.chainofresp;

class Director extends Leader {

    public Director(String name) {
        super(name);
    }

    public void handleRequest(LeaveRequest req) {
        if( req.days < 10) {
            System.out.println(this.name + "批准" + req.name + "请教" + req.days + "天");
        } else {
            if(this.leader != null) {
                this.leader.handleRequest(req);
            }
        }
    }
}