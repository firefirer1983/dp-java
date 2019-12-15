package com.dp.state;


class Context {
    private State state;

    public void transition(State state) {
        this.state = state;
        state.handle();
    }
}