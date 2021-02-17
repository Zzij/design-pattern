package com.zz.design.prototype.deepclone;

public class TestDeepClone {

    public static void main(String[] args) throws CloneNotSupportedException {
        Teacher teacher1 = new Teacher("zz", new Student("aa", 123));
        Teacher teacher2 = (Teacher) teacher1.clone();

        teacher1.getStudent().setName("bb");

        System.out.println(teacher1);
        System.out.println(teacher2);

        Teacher teacher3 = teacher1.deepClone();
        teacher1.getStudent().setName("cc");
        System.out.println(teacher1);
        System.out.println(teacher3);
    }
}
