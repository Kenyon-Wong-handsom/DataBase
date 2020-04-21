package pers.sanne.domain;

public class Category {

    private String className;

    public String getClassName() {
        return className;
    }

    public void setClass(String className) {
        this.className = className == null ? null : className.trim();
    }
}