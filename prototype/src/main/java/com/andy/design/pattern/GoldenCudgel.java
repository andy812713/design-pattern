package com.andy.design.pattern;

import java.io.Serializable;
import java.util.Date;

public class GoldenCudgel implements Serializable {

    private String width;
    private String height;
    private Long createDate;

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public Long getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Long createDate) {
        this.createDate = System.currentTimeMillis();
    }

    @Override
    public String toString() {
        return "GoldenCudgel{" +
                "width='" + width + '\'' +
                ", height='" + height + '\'' +
                ", createDate='" + createDate + '\'' +
                '}';
    }
}
