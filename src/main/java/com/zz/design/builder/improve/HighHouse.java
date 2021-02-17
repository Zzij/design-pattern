package com.zz.design.builder.improve;

import com.zz.design.builder.AbstractHouse;

public class HighHouse extends AbstractHouse {
    @Override
    public void buildBasic() {
        System.out.println("高楼打地基");
    }

    @Override
    public void builderWalls() {
        System.out.println("高楼建墙");
    }

    @Override
    public void roofed() {
        System.out.println("高楼封顶");
    }
}
