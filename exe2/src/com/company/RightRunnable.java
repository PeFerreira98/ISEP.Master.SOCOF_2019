package com.company;

public class RightRunnable implements Runnable {
    private LeftRightDeadlock lrdead;

    public RightRunnable(LeftRightDeadlock lr){ lrdead = lr; }

    @Override
    public void run() {
        lrdead.rightLeft();
    }
}
