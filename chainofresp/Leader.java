package chainofresp;


abstract class Leader {
    protected String name;
    protected Leader leader;

    public Leader(String name) {
        this.name = name;
    }

    public void setLeader(Leader l) {
        this.leader = l;
    }

    abstract public void handleRequest(LeaveRequest req);
}