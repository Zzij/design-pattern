package com.zz.design.builder.improve;

public class CommonHouse extends HouseBuilder {
    @Override
    public void buildBasic() {
        this.house.setBasic("普通");
        System.out.println("普通房子打地基");
    }

    @Override
    public void buildWalls() {
        this.house.setWalls("普通");
        System.out.println("普通房子建墙");
    }

    @Override
    public void roofed() {
        this.house.setRoofed("普通");
        System.out.println("普通房子封顶");
    }
}
