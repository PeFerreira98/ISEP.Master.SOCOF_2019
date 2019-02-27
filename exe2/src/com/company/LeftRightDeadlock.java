package com.company;

public class LeftRightDeadlock {
    private final Object left = new Object();
    private final Object right = new Object();

    public void leftRight() {
        synchronized (left) {
            synchronized (right) {
                try {
                    Thread.sleep(1000);
                    System.out.println("leftRight");
                } catch (Exception e){
                    System.out.println("ERROR! ->" + e);
                }
            }
        }
    }

    public void rightLeft() {
        synchronized (right) {
            synchronized (left) {
                try {
                    Thread.sleep(1000);
                    System.out.println("rightLeft");
                } catch (Exception e){
                    System.out.println("ERROR! ->" + e);
                }
            }
        }
    }
}