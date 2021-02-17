package com.zz.design.prototype.improve;

import javax.sound.midi.Soundbank;

public class TestImprove {

    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep sheep = new Sheep("tom", 12, "red");
        Sheep sheep1 = new Sheep("tom", 12, "red");
        Sheep sheep2 = (Sheep) sheep1.clone();
        Sheep sheep3 = (Sheep) sheep1.clone();
        sheep1.setName("pig");
        System.out.println(sheep + ", hashcode" + sheep1.hashCode());
        System.out.println(sheep1 + ", hashcode" + sheep1.hashCode());
        System.out.println(sheep2 + ", hashcode" + sheep1.hashCode());
        System.out.println(sheep3 + ", hashcode" + sheep1.hashCode());
    }
}
