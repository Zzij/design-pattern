package com.zz.design.prototype.deepclone;

import java.io.*;

public class Teacher implements Cloneable,Serializable{

    private String name;

    private Student student;

    public Teacher(String name, Student student) {
        this.name = name;
        this.student = student;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", student=" + student +
                '}';
    }

    /**
     * 方式一  对引用对象再次clone
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Teacher teacher = null;
        //这个只会拷贝 基本数据类型和String
        teacher = (Teacher) super.clone();
        //对于引用对象 再次去clone
        teacher.student = (Student) student.clone();
        return teacher;
    }

    /**
     * 深拷贝  方式二  序列化  推荐
     * @return
     */
    public Teacher deepClone(){

        Teacher teacher = null;

        ByteArrayInputStream bis = null;
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        try {
            //将对象转为byte数组序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            //反序列化, 将byte数组转为对象
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            teacher = (Teacher) ois.readObject();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        return teacher;
    }
}
