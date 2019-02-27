package com.company;

public class Main {

    public static void main(String[] args) {
        int coreNumbers = Runtime.getRuntime().availableProcessors();

        LeftRightDeadlock lrdead = new LeftRightDeadlock();

        for (int i=0; i<coreNumbers; i++)
            new Thread(new LeftRunnable(lrdead)).start();

        for (int i=0; i<coreNumbers; i++)
            new Thread(new RightRunnable(lrdead)).start();
    }
}
