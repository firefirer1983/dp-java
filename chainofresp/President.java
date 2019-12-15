package chainofresp;


class President extends Leader {

    public President(String name) {
        super(name);
    }

    public void handleRequest(LeaveRequest req) {
        if( req.days < 30) {
            System.out.println(this.name + "批准" + req.name + "请教" + req.days + "天");
        } else {
            System.out.println(this.name + "驳回了" + req.name + "请假" + ",原因是请假超过30天的人直接炒");
        }
    }
}