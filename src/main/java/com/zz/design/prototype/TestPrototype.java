package com.zz.design.prototype;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestPrototype {
    public static void main(String[] args) {
        /**
         * 生成10个sheep对象
         */
        List<Sheep> sheeps = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            sheeps.add(new Sheep("tom", 12, "red"));
        }
        System.out.println(Arrays.toString(sheeps.toArray()));
    }
}
