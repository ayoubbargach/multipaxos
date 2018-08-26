package se.kth.id2203.multipaxos.events;

import se.sics.kompics.KompicsEvent;

import java.io.Serializable;

public class Decide implements KompicsEvent, Serializable {
    protected final int ts;
    protected final int l;
    protected final int t;

    public Decide(int ts, int l, int t) {
        this.ts = ts;
        this.l = l;
        this.t = t;
    }

    public int getTs() {
        return ts;
    }

    public int getL() {
        return l;
    }

    public int getT() {
        return t;
    }
}