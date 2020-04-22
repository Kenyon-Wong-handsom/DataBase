package pers.sanne.domain;

public class Category {
    private Integer id;

    private Integer userId;

    private String className;

    public String getClassName() {
        return className;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", userId=" + userId +
                ", className='" + className + '\'' +
                '}';
    }
}