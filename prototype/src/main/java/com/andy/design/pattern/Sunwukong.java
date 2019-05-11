package com.andy.design.pattern;

import java.io.*;

public class Sunwukong implements Monkey, Cloneable, Serializable {

    private String name;
    private String age;
    private GoldenCudgel goldenCudgel;

    /**默认深拷贝*/
    private boolean deepFlag = true;


    /**通过文件流进行深拷贝*/
    private Object deepClone() {
        ObjectOutputStream oo = null;
        ByteArrayInputStream bi = null;
        ObjectInputStream oi = null;
        try {
            ByteArrayOutputStream bo = new ByteArrayOutputStream();
            oo = new ObjectOutputStream(bo);
            oo.writeObject(this);

            bi = new ByteArrayInputStream(bo.toByteArray());
            oi = new ObjectInputStream(bi);
            return oi.readObject();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                if (oo != null) {
                    oo.close();
                }
                if (bi != null) {
                    bi.close();
                }
                if (oi != null) {
                    oi.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }


    @Override
    public Object clone() throws CloneNotSupportedException{
        if(deepFlag){
            return deepClone();
        } else{
           return super.clone();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public GoldenCudgel getGoldenCudgel() {
        return goldenCudgel;
    }

    public void setGoldenCudgel(GoldenCudgel goldenCudgel) {
        this.goldenCudgel = goldenCudgel;
    }

    @Override
    public String toString() {
        return "Sunwukong{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", goldenCudgel=" + goldenCudgel +
                ", deepFlag=" + deepFlag +
                '}';
    }
}
