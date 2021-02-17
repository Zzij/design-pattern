package com.zz.design.builder.improve;

public class Client {

    public static void main(String[] args) {
        //创建普通房子
        CommonHouse commonHouse = new CommonHouse();
        HouseDirector houseDirector = new HouseDirector(commonHouse);

        House house = houseDirector.constructHouse();

        System.out.println(house);

    }
}
