package com.designpatternsex.examples.adapter;

public class OldRobotImpl implements OldRobot {

    @Override
    public void walkFoward(String direction) {
        System.out.println("Walking forward in direction: " + direction);
    }

}
