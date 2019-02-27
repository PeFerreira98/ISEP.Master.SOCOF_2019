package com.company;

public class LeftRunnable implements Runnable {
    private LeftRightDeadlock lrdead;

    public LeftRunnable(LeftRightDeadlock lr){ lrdead = lr; }

    @Override
    public void run() { lrdead.leftRight(); }
}
